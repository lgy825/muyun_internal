package com.muyun.back.controller;

import com.muyun.back.service.owner.OwnerService;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.constant.PageResult;
import com.muyun.core.model.owner.Owner;
import com.muyun.core.model.owner.OwnerExample;
import com.muyun.core.model.owner.OwnerExt;
import com.muyun.core.util.IdUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/19.
 */
@Controller
@RequestMapping("/owner")
public class OwnerController extends BaseController {

    @Autowired
    private OwnerService ownerService;

    @RequestMapping("/toOwnerlist")
    public String toList() {
        return "owner/ownerlist";
    }

    @RequestMapping("/toaddOwner")
    public String toaddOwner() {
        return "owner/newowner";
    }

    @RequestMapping("/getpage")
    @ResponseBody
    public PageResult<OwnerExt> getShopPageByCondition(HttpServletRequest request,
                                                    Integer pageIndex,
                                                    Integer pageSize,
                                                    String uTel,
                                                    String uName) {
        Map<String, Object> params = new HashMap<>();
        params.put("uName", uName);
        params.put("uTel", uTel);
        params.put("pageIndex", pageIndex + 1);
        params.put("pageSize", pageSize);
        return createSuccessPageResult(ownerService.getPageByCondition(params));
    }

    @RequestMapping("/saveOwner")
    @ResponseBody
    public Result<Boolean> save(Owner owner) {
        if(StringUtils.isBlank(owner.getId())) {
            owner.setId(IdUtils.getId(11));
            try {
                ownerService.insert(owner);
            } catch (Exception e1) {
                return createFailedResult(e1.getMessage(), false);
            }
        } else {
            return  createSuccessResult(ownerService.update(owner));
        }
        return createSuccessResult(true);
    }

    @RequestMapping("/tolook")
    public String toLook(String id, Model model) {
        if(StringUtils.isBlank(id)) {
            return "owner/ownerlist";
        }
        model.addAttribute("uId", id);
        return "owner/lookowner";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Result<Owner> update(String id) {
        if(StringUtils.isBlank(id)) {
            return createFailedResult("查询失败");
        }
        return createSuccessResult(ownerService.getOwnerById(id));
    }

    @RequestMapping("/toedit")
    public String toEdit(String id, Model model) {
        if(StringUtils.isBlank(id)) {
            return "owner/ownerlist";
        }
        model.addAttribute("uId", id);
        return "owner/newowner";
    }

    @RequestMapping("/disableowner")
    @ResponseBody
    public Result<Boolean> disableOwner(String id) {
        Owner owner=new Owner();
        owner.setId(id);
        owner.setuStatus(1);
        return createSuccessResult(ownerService.update(owner));
    }

    @RequestMapping("/undisableowner")
    @ResponseBody
    public Result<Boolean> undisableowner(String id) {
        Owner owner=new Owner();
        owner.setId(id);
        owner.setuStatus(0);
        owner.setuDate(new Date());
        return createSuccessResult(ownerService.update(owner));
    }
}
