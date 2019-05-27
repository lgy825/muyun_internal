package com.muyun.bapp.controller;

import com.muyun.back.service.owner.OwnerService;
import com.muyun.bapp.service.AppService;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.model.owner.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public Result login(@RequestParam(value = "ownerPhone", required = true) String ownerPhone,
                        @RequestParam(value = "ownerPwd", required = true) String ownerPwd) {
        if (ownerPhone == null) {
            return createFailedResult("手机号输入为空，请重新输入");
        }
        if (ownerPwd == null) {
            return createFailedResult("密码输入为空，请重新输入");
        }
        Owner owner = new Owner();
        owner.setuPwd(ownerPwd);
        owner.setuTel(ownerPhone);
        return createSuccessResult(ownerService.getOwnerByCondition(owner));
    }

    //用户修改密码接口
    @RequestMapping("/update")
    public Result<Boolean> updatePwd(@RequestBody Owner owner) {
        return createSuccessResult(ownerService.update(owner));
    }

    //首页界面
    @RequestMapping("/getDateByCondition")
    public Result<Map<String, Object>> getDateByCondition(@RequestParam(value = "userId", required = true) String userId,
                                                          @RequestParam(value = "beginTime", required = true) String beginTime,
                                                          @RequestParam(value = "endTime", required = true) String endTime) {
        if (userId == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", userId);
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);

        return createSuccessResult(appService.getDateByCondition(params));
    }

    //获取收益，根据时间区间
    @RequestMapping("/getIncomeByCondition")
    public Result<Double> getIncomeByCondition(@RequestParam(value = "userId", required = true) String userId,
                                               @RequestParam(value = "beginTime", required = true) String beginTime,
                                               @RequestParam(value = "endTime", required = true) String endTime) {
        if (userId == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", userId);
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);

        return createSuccessResult(appService.getIncomeByCondition(params));
    }

    //获取收益列表

    @RequestMapping("/getOrderPageByCondition")
    public Result<List<OrderExt>> getOrderPageByCondition(@RequestParam(value = "userId", required = true) String userId,
                                                          @RequestParam(value = "beginTime", required = true) String beginTime,
                                                          @RequestParam(value = "endTime", required = true) String endTime) {
        if (userId == null) {
            return createFailedResult("500错误，用户id为空");
        }

        Map<String, String> params = new HashMap<>();
        params.put("userId", userId);
        params.put("beginTime", beginTime);
        params.put("endTime", endTime);

        return createSuccessResult(appService.getOrderPage(params));
    }

    //根据订单idcha'查看订单的详情
    @RequestMapping("/getOrderInfoById")
    public Result<OrderExt> getOrderInfoById(@RequestParam(value = "orderId", required = true) String orderId){
        if (orderId == null) {
            return createFailedResult("500错误,订单id为空");
        }
        return createSuccessResult(appService.getOrderInfoById(orderId));

    }
}
