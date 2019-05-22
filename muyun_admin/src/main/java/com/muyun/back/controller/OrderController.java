package com.muyun.back.controller;

import com.muyun.back.service.order.OrderSercvice;
import com.muyun.core.base.BaseController;
import com.muyun.core.base.Result;
import com.muyun.core.constant.PageResult;
import com.muyun.core.model.order.OrderExt;

import com.muyun.core.model.order.OrderItem;
import com.muyun.core.util.IdUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class OrderController extends BaseController{

    @Autowired
    private OrderSercvice orderSercvice;

    @RequestMapping("/toOrderlist")
    public String toOrderlist() {
        return "order/orderlist";
    }

    @RequestMapping("/toOrderItemlist")
    public String toOrderItemlist() {
        return "order/orderItemlist";
    }

    @RequestMapping("/getpage")
    @ResponseBody
    public PageResult<OrderExt> getShopPageByCondition(HttpServletRequest request,
                                                       Integer pageIndex,
                                                       Integer pageSize,
                                                       String beginTime,
                                                       String endTime,
                                                       String oId) {
        Map<String, Object> params = new HashMap<>();
        params.put("beginTime", beginTime);
        params.put("endTime",endTime);
        params.put("oId", oId);
        params.put("pageIndex", pageIndex + 1);
        params.put("pageSize", pageSize);
        return createSuccessPageResult(orderSercvice.getPageByCondition(params));
    }

    @RequestMapping("/getOrderItemPage")
    @ResponseBody
    public PageResult<OrderItem> getOrderItemPage(HttpServletRequest request,
                                                  Integer pageIndex,
                                                  Integer pageSize,
                                                  String dName,
                                                  String oId) {
        Map<String, Object> params = new HashMap<>();
        params.put("dName", dName);
        params.put("oId", oId);
        params.put("pageIndex", pageIndex + 1);
        params.put("pageSize", pageSize);
        return createSuccessPageResult(orderSercvice.getOrderItemPage(params));
    }

    @RequestMapping("/toeditItem")
    public String toEdit(String id, Model model) {
        if(StringUtils.isBlank(id)) {
            return "order/orderItemlist";
        }
        model.addAttribute("dId", id);
        return "order/addOrderItem";
    }

    @RequestMapping("/toaddOrderItem")
    public String toaddOrderItem(String id) {

        return "order/addOrderItem";
    }

    @RequestMapping("/saveOrderItem")
    @ResponseBody
    public Result<Boolean> save(OrderItem orderItem) {
        if(StringUtils.isBlank(orderItem.getdId())) {
            orderItem.setdId(IdUtils.getId(11));
            try {
                orderSercvice.saveOrderItem(orderItem);
            } catch (Exception e1) {
                return createFailedResult(e1.getMessage(), false);
            }
        } else {
            return  createSuccessResult(orderSercvice.update(orderItem));
        }
        return createSuccessResult(true);
    }

    //deleteOrderItem
    @RequestMapping("/deleteOrderItem")
    @ResponseBody
    public Result<Boolean> deleteOrderItem(String dId) {

        return createSuccessResult(orderSercvice.delete(dId));
    }
}

