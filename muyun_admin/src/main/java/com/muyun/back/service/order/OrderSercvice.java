package com.muyun.back.service.order;

import com.muyun.core.constant.GenericPage;
import com.muyun.core.model.order.Order;
import com.muyun.core.model.order.OrderExt;
import com.muyun.core.model.order.OrderItem;

import java.util.Map;

public interface OrderSercvice {

    GenericPage<OrderExt> getPageByCondition(Map<String, Object> params);

    GenericPage<OrderItem> getOrderItemPage(Map<String, Object> params);

    boolean saveOrderItem(OrderItem orderItem);

    boolean update(OrderItem orderItem);

    boolean delete(String dId);
}
