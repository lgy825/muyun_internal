package com.muyun.back.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.muyun.back.service.AdminService;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.model.admin.Admin;
import com.muyun.core.util.ValidCodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.security.auth.Subject;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by 13544 on 2019/5/19.
 */
@Controller
//@RequestMapping("/index")
public class IndexController extends BaseController {

    private static  final Logger log= LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private Producer captchaProducer;

    @Autowired
    private Producer captchaProducerMath;

    @Autowired
    private AdminService adminService;

    @RequestMapping("/tologin")
    public String toLogin(HttpSession session) {
        log.info("开始访问登录页面");
        return "login";
    }

    @RequestMapping("/workbench")
    public String toWorkBench() {
        log.info("开始访问登录页面");
        return "/index/workbench";
    }

    @RequestMapping(value = "/index/getCodeImg", method = RequestMethod.GET)
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response)
    {
        ServletOutputStream out = null;
        try
        {
            HttpSession session = request.getSession();
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");

            String type = request.getParameter("type");
            String capStr = null;
            String code = null;
            BufferedImage bi = null;
            if ("math".equals(type))//验证码为算数 8*9 类型
            {
                String capText = captchaProducerMath.createText();
                capStr = capText.substring(0, capText.lastIndexOf("@"));
                code = capText.substring(capText.lastIndexOf("@") + 1);
                bi = captchaProducerMath.createImage(capStr);
            }
            else if ("char".equals(type))//验证码为 abcd类型
            {
                capStr = code = captchaProducer.createText();
                bi = captchaProducer.createImage(capStr);
            }
            session.setAttribute("validateCode", code);
            out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
            out.flush();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result<String> login(String username,
                                String passwd,
                                String verifyCode,
                                String flag,
                                HttpSession session,
                                HttpServletResponse response,
                                HttpServletRequest request) {
        if (!ValidCodeUtil.validate(request, verifyCode)) {
            return createFailedResult("验证码错误");
        }
        Boolean loginSuccess = false;
        try {
            Admin admin=new Admin();
            admin.setAdminName(username);
            admin.setAdminPwd(passwd);
            loginSuccess=adminService.loginVali(admin);
        } catch (Exception e) {
            log.error(username + ",登陆失败", e);
            return createFailedResult(e.getMessage());
        }
        if(loginSuccess) {
            if ("1".equals(flag)) {
                Cookie cookie = new Cookie("cookie_user", username + "-" + passwd + "-" + flag);
                cookie.setMaxAge(60 * 60 * 24 * 30); // cookie 保存30天
                response.addCookie(cookie);
            } else {
                Cookie cookie = new Cookie("cookie_user", username + "-" + "" + "-" + flag);
                cookie.setMaxAge(60 * 60 * 24 * 30); // cookie 保存30天
                response.addCookie(cookie);
            }
        } else {
            return createFailedResult("登录失败");
        }
        return createSuccessResult("main");
    }

    @RequestMapping("/main")
    public String toindex(Model model) {
        return "main";
    }


}
