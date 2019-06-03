package com.muyun.bapp.controller;

import com.muyun.back.service.owner.OwnerService;
import com.muyun.bapp.service.AppService;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.model.owner.Owner;
import com.muyun.core.util.AppRequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/24.
 */
@Controller
@RequestMapping("app")
public class UserController extends BaseController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private AppService appService;

    //用户登录接口
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody AppRequestParam appRequestParam) {
        if (appRequestParam.getOwnerPhone() == null && appRequestParam.getOwnerName()==null) {
            return createFailedResult("请输入手机号或用户名");
        }
        if (appRequestParam.getOwnerPwd() == null) {
            return createFailedResult("密码输入为空，请重新输入");
        }
        Owner owner = new Owner();
        owner.setuPwd(appRequestParam.getOwnerPwd());
        owner.setuName(appRequestParam.getOwnerName());
        owner.setuTel(appRequestParam.getOwnerPhone());
        try {

            return createSuccessResult(ownerService.getOwnerByCondition(owner));
        } catch (Exception e) {
            return createFailedResult(e.getMessage());
        }
    }

    //用户修改密码接口
    @RequestMapping("/update")
    @ResponseBody
    public Result<Boolean> updatePwd(@RequestBody AppRequestParam appRequestParam) {
        Owner owner=new Owner();
        owner.setuName(appRequestParam.getOwnerName());
        owner.setuPwd(appRequestParam.getOwnerPwd());
        owner.setuTel(appRequestParam.getOwnerPhone());
        return createSuccessResult(ownerService.update(owner));
    }

    //首页界面
    @RequestMapping("/getDateByCondition")
    @ResponseBody
    public Result<Map<String, Object>> getDateByCondition(@RequestBody AppRequestParam appRequestParam) {
        if (appRequestParam.getOwnerId() == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", appRequestParam.getOwnerId());
        params.put("beginTime", appRequestParam.getBeginTime());
        params.put("endTime", appRequestParam.getEndTime());

        return createSuccessResult(appService.getDateByCondition(params));
    }

    //获取收益，根据时间区间
    @RequestMapping("/getIncomeByCondition")
    @ResponseBody
    public Result<Double> getIncomeByCondition(@RequestBody AppRequestParam appRequestParam) {
        if (appRequestParam.getOwnerId() == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", appRequestParam.getOwnerId());
        params.put("beginTime", appRequestParam.getBeginTime());
        params.put("endTime", appRequestParam.getEndTime());

        return createSuccessResult(appService.getIncomeByCondition(params));
    }

    //获取收益列表

    @RequestMapping("/getOrderPageByCondition")
    @ResponseBody
    public Result<List<OrderExt>> getOrderPageByCondition(@RequestBody AppRequestParam appRequestParam) {
        if (appRequestParam.getOwnerId() == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", appRequestParam.getOwnerId());
        params.put("beginTime", appRequestParam.getBeginTime());
        params.put("endTime", appRequestParam.getEndTime());

        return createSuccessResult(appService.getOrderPage(params));
    }

    //根据订单idcha'查看订单的详情
    @RequestMapping("/getOrderInfoById")
    @ResponseBody
    public Result<OrderExt> getOrderInfoById(@RequestBody AppRequestParam appRequestParam){
        if (appRequestParam.getOrderId() == null) {
            return createFailedResult("500错误,订单id为空");
        }
        return createSuccessResult(appService.getOrderInfoById(appRequestParam.getOrderId()));

    }
}
