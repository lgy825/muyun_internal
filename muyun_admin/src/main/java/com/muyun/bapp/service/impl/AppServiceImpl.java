package com.muyun.bapp.service.impl;

import com.muyun.bapp.service.AppService;
import com.muyun.core.dao.order.OrderItemMapper;
import com.muyun.core.dao.order.OrderItemMapperExt;
import com.muyun.core.dao.order.OrderMapperExt;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.model.order.OrderItem;
import com.muyun.core.util.AppResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/25.
 */
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private OrderMapperExt orderMapperExt;
    @Autowired
    private OrderItemMapperExt orderItemMapperExt;

    @Override
    public Map<String, Object> getDateByCondition(Map<String, String> params) {

        //根据用户Id和时间获取收益
        double incomeAll=orderMapperExt.getAmountByCondition(params);
        //获取房子出租的天数
        int count=orderMapperExt.getCountByCondition(params);
        //获取房子出租率
        DecimalFormat df = new DecimalFormat("#0.00");
        String houseRate=Math.round((count*100)/30)+"";
        //获取成本费
        double extraCosts=orderMapperExt.getExtraAmountByCondition(params);

        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("incomeAll",incomeAll);
        resultMap.put("count",count);
        resultMap.put("houseRate",houseRate);
        resultMap.put("extraCosts",extraCosts);

        return resultMap;
    }

    @Override
    public double getIncomeByCondition(Map<String, String> params) {
        double incomeAll=orderMapperExt.getAmountByCondition(params);
        return incomeAll;
    }

    @Override
    public List<AppResponseObj> getOrderPage(Map<String, String> params) {

        List<AppResponseObj> orderExtList=orderMapperExt.getOrderPageBycondition(params);
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        for(AppResponseObj obj:orderExtList){
//            obj.setDate(sdf.(obj.getDate()));
//        }
        return orderExtList;
    }

    @Override
    public OrderExt getOrderInfoById(String oId) {
        OrderExt orderExt=orderMapperExt.getOrderInfoById(oId);
        List<OrderItem> itemList=orderItemMapperExt.getOrderItemByOId(oId);
        orderExt.sethNumber(orderMapperExt.getHourseNumberById(orderExt.gethId()));
        if(itemList!=null){
            orderExt.setOrderItems(itemList);
        }
        return orderExt;
    }
}
