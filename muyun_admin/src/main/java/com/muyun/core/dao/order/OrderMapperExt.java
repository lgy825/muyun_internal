package com.muyun.core.dao.order;

import com.muyun.core.model.order.Order;
import com.muyun.core.model.order.OrderExample;
import com.muyun.core.model.order.OrderExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderMapperExt {

    List<OrderExt> getOrderPage(Map<String, Object> params);

    String getHourseNumberById(String hId);
}