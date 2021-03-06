package com.muyun.back.controller;

import com.muyun.back.service.hourse.HourseService;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.constant.PageResult;
import com.muyun.core.model.hourse.Hourse;
import com.muyun.core.model.hourse.HourseExt;
import com.muyun.core.util.IdUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/20.
 */
@RequestMapping("hourse")
@Controller
public class HourseController extends BaseController {


    @Autowired
    private HourseService hourseService;

    @RequestMapping("/toHourselist")
    public String toHourselist() {
        return "hourse/hourselist";
    }

    @RequestMapping("/getpage")
    @ResponseBody
    public PageResult<HourseExt> getShopPageByCondition(HttpServletRequest request,
                                                        Integer pageIndex,
                                                        Integer pageSize,
                                                        String hNumber,
                                                        String hNumberArea) {
        Map<String, Object> params = new HashMap<>();
        params.put("hNumber", hNumber);
        params.put("hNumberArea", hNumberArea);
        params.put("pageIndex", pageIndex + 1);
        params.put("pageSize", pageSize);
        return createSuccessPageResult(hourseService.getPageByCondition(params));
    }

    @RequestMapping("/saveHourse")
    @ResponseBody
    public Result<Boolean> save(Hourse hourse) {
        if(StringUtils.isBlank(hourse.gethId())) {
            hourse.sethId(IdUtils.getId(11));
            try {
                hourseService.insert(hourse);
            } catch (Exception e1) {
                return createFailedResult(e1.getMessage(), false);
            }
        } else {
           return  createSuccessResult(hourseService.update(hourse));
        }
        return createSuccessResult(true);
    }

    @RequestMapping("/tolook")
    public String toLook(String hId, Model model) {
        if(StringUtils.isBlank(hId)) {
            return "hourse/hourselist";
        }
        model.addAttribute("hId", hId);
        return "hourse/lookhourse";
    }

    @RequestMapping("/toedit")
    public String toEdit(String hId, Model model) {
        if(StringUtils.isBlank(hId)) {
            return "hourse/hourselist";
        }
        model.addAttribute("hId", hId);
        return "hourse/newhourse";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Result<Hourse> update(String hId) {
        if(StringUtils.isBlank(hId)) {
            return createFailedResult("查询失败");
        }
        return createSuccessResult(hourseService.getHourseByIdById(hId));
    }

    @RequestMapping("/toaddHourse")
    public String toaddHourse() {
        return "hourse/newhourse";
    }

    @RequestMapping("/deleteHourse")
    @ResponseBody
    public Result<Boolean> deleteHourse(String hId) {

        return createSuccessResult(hourseService.deleteByPrimaryKey(hId));
    }
}
