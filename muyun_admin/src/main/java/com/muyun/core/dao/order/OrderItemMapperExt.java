package com.muyun.core.dao.order;

import com.muyun.core.model.order.OrderItem;
import com.muyun.core.model.order.OrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderItemMapperExt {

    List<OrderItem> getOrderItemPage(Map<String, Object> params);

    List<OrderItem> getOrderItemByOId(String oId);

    double getTotalForItem(String oId);
}