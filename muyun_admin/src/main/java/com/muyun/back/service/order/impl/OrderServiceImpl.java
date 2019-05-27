package com.muyun.back.service.order.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.muyun.back.service.order.OrderSercvice;
import com.muyun.core.constant.GenericPage;
import com.muyun.core.dao.order.OrderItemMapper;
import com.muyun.core.dao.order.OrderItemMapperExt;
import com.muyun.core.dao.order.OrderMapper;
import com.muyun.core.dao.order.OrderMapperExt;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.model.order.OrderItem;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 订单业务处理 ClassName:OrderServiceImpl
 *
 * @author ligy-008494
 * @create 2019-05-22 19:52
 */
@Service
public class OrderServiceImpl implements OrderSercvice{

    @Autowired
    private OrderMapperExt orderMapperExt;

    @Autowired
    private OrderItemMapperExt orderItemMapperExt;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public GenericPage<OrderExt> getPageByCondition(Map<String, Object> params) {
        int pageIndex = 1, pageSize = 10;
        if(params.containsKey("pageIndex")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageIndex").toString())) {
                pageIndex = Integer.valueOf(params.get("pageIndex").toString());
                if(pageIndex < 1) {
                    pageIndex = 1;
                }
            }
        }
        if(params.containsKey("pageSize")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageSize").toString())) {
                pageSize = Integer.valueOf(params.get("pageSize").toString());
                if(pageSize < 1) {
                    pageSize = 10;
                }
            }
        }
        Page<OrderExt> pageInfo = PageHelper.startPage(pageIndex, pageSize, true);
        List<OrderExt> orderExts=orderMapperExt.getOrderPage(params);
        for(OrderExt orderExt:orderExts){
            orderExt.sethNumber(orderMapperExt.getHourseNumberById(orderExt.gethId()));
        }
        return new GenericPage<>(pageIndex, pageSize, orderExts, pageInfo.getTotal());

    }

    @Override
    public GenericPage<OrderItem> getOrderItemPage(Map<String, Object> params) {
        int pageIndex = 1, pageSize = 10;
        if(params.containsKey("pageIndex")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageIndex").toString())) {
                pageIndex = Integer.valueOf(params.get("pageIndex").toString());
                if(pageIndex < 1) {
                    pageIndex = 1;
                }
            }
        }
        if(params.containsKey("pageSize")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageSize").toString())) {
                pageSize = Integer.valueOf(params.get("pageSize").toString());
                if(pageSize < 1) {
                    pageSize = 10;
                }
            }
        }
        Page<OrderItem> pageInfo = PageHelper.startPage(pageIndex, pageSize, true);
        List<OrderItem> orderItems=orderItemMapperExt.getOrderItemPage(params);
        return new GenericPage<>(pageIndex, pageSize, orderItems, pageInfo.getTotal());
    }

    @Override
    public boolean saveOrderItem(OrderItem orderItem) {
        if(orderItem!=null) {
            orderItem.setdDate(new Date());
            try {
                orderItemMapper.insertSelective(orderItem);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean saveOrder(com.muyun.core.model.order.Order order) {

        if(order!=null) {
            order.setoDate(new Date());
            order.setoStatus(0);
            try {
                orderMapper.insertSelective(order);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean update(OrderItem orderItem) {
        try {
            orderItem.setdDate(new Date());
            orderItemMapper.updateByPrimaryKeySelective(orderItem);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateOrder(com.muyun.core.model.order.Order order) {
        try {
            order.setoDate(new Date());
            orderMapper.updateByPrimaryKeySelective(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String dId) {
        try {
            orderItemMapper.deleteByPrimaryKey(dId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteOrder(String oId) {
        try {
            orderMapper.deleteByPrimaryKey(oId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public OrderExt getOrderInfoById(String oId) {
        OrderExt orderExt=orderMapperExt.getOrderInfoById(oId);
        if(orderExt.getoWay()==0){
            orderExt.setPayWay("微信");
        }else if(orderExt.getoWay()==1){
            orderExt.setPayWay("支付包");
        }else{
            orderExt.setPayWay("线下支付");
        }
        List<OrderItem> itemList=orderItemMapperExt.getOrderItemByOId(oId);
        orderExt.sethNumber(orderMapperExt.getHourseNumberById(orderExt.gethId()));
        if(itemList!=null){
            orderExt.setOrderItems(itemList);
        }
        return orderExt;
    }
}

