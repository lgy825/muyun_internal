package com.muyun.back.controller;

import com.muyun.core.constant.PageResult;
import com.muyun.core.model.order.OrderExt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * 订单管理 ClassName:OrderController
 *
 * @author ligy-008494
 * @create 2019-05-22 19:45
 */
@RequestMapping("order")
@Controller
public class OrderController {

    @RequestMapping("/toOrderlist")
    public String toHourselist() {
        return "order/orderlist";
    }

    @RequestMapping("/getpage")
    @ResponseBody
    public PageResult<OrderExt> getShopPageByCondition(HttpServletRequest request,
                                                       Integer pageIndex,
                                                       Integer pageSize,
                                                       String oId,
                                                       String oDate) {
        Map<String, Object> params = new HashMap<>();
        params.put("oDate", oDate);
        params.put("oId", oId);
        params.put("pageIndex", pageIndex + 1);
        params.put("pageSize", pageSize);
        return createSuccessPageResult(hourseService.getPageByCondition(params));
    }
}

