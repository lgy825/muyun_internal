package com.muyun.back.service.order.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.muyun.back.service.order.OrderSercvice;
import com.muyun.core.constant.GenericPage;
import com.muyun.core.dao.order.*;
import com.muyun.core.model.order.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
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

    @Autowired
    private OrderSourceMapper orderSourceMapper;

    @Autowired
    private PayWayMapper payWayMapper;


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
        Map<Integer,String> payWays=getAllPayWayMap();
        Map<String,String> orderSources=getAllOrderSourceMap();
        Page<OrderExt> pageInfo = PageHelper.startPage(pageIndex, pageSize, true);
        List<OrderExt> orderExts=orderMapperExt.getOrderPage(params);
        for(OrderExt orderExt:orderExts){
            orderExt.sethNumber(orderMapperExt.getHourseNumberById(orderExt.gethId()));
            if(payWays.containsKey(orderExt.getoWay())){
                orderExt.setPayWay(payWays.get(orderExt.getoWay()));
            }
            if(orderSources.containsKey(orderExt.getoSource())){
                orderExt.setSourceWay(orderSources.get(orderExt.getoSource()));
            }

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
        Map<Integer,String> payWays=getAllPayWayMap();
        Map<String,String> orderSources=getAllOrderSourceMap();
        if(payWays.containsKey(orderExt.getoWay())){
            orderExt.setPayWay(payWays.get(orderExt.getoWay()));
        }
        if(orderSources.containsKey(orderExt.getoSource())){
            orderExt.setSourceWay(orderSources.get(orderExt.getoSource()));
        }
        List<OrderItem> itemList=orderItemMapperExt.getOrderItemByOId(oId);
        orderExt.sethNumber(orderMapperExt.getHourseNumberById(orderExt.gethId()));
        if(itemList!=null){
            orderExt.setOrderItems(itemList);
        }
        return orderExt;
    }

    @Override
    public List<OrderSource> getOrderSource() {
        List<OrderSource> orderSources=orderSourceMapper.getOrderSourceAll();
        return orderSources;
    }

    @Override
    public List<PayWay> getPayWay() {
        List<PayWay> payWays=payWayMapper.getPayWayAll();
        return payWays;
    }

    @Override
    public Order get(String oId) {

        return orderMapper.selectByPrimaryKey(oId);
    }

    public Map<Integer,String> getAllPayWayMap(){
        List<PayWay> payWays=payWayMapper.getPayWayAll();
        Map<Integer,String> stringMap=new HashMap<>();
        for(PayWay payWay:payWays){
            stringMap.put(payWay.getpId(),payWay.getpName());
        }
        return stringMap;
    }

    public Map<String,String> getAllOrderSourceMap(){
        List<OrderSource> orderSources=orderSourceMapper.getOrderSourceAll();
        Map<String,String> stringMap=new HashMap<>();
        for(OrderSource orderSource:orderSources){
            stringMap.put(orderSource.getsId(),orderSource.getsName());
        }
        return stringMap;
    }


}

