package com.muyun.core.dao.order;

import com.muyun.core.model.order.Order;
import com.muyun.core.model.order.OrderExample;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.util.AppResponseObj;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderMapperExt {

    List<OrderExt> getOrderPage(Map<String, Object> params);

    String getHourseNumberById(String hId);

    OrderExt getOrderInfoById(String oId);

    double getAmountByCondition(Map<String,String> params);

    int getCountByCondition(Map<String,String> params);

    double getExtraAmountByCondition(Map<String,String> params);

    List<AppResponseObj> getOrderPageBycondition(Map<String,String> params);
}