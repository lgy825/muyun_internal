package com.muyun.back.service.order;

import com.muyun.core.constant.GenericPage;
import com.muyun.core.model.order.*;

import java.util.List;
import java.util.Map;

public interface OrderSercvice {

    GenericPage<OrderExt> getPageByCondition(Map<String, Object> params);

    GenericPage<OrderItem> getOrderItemPage(Map<String, Object> params);

    boolean saveOrderItem(OrderItem orderItem);

    boolean saveOrder(Order order);

    boolean update(OrderItem orderItem);

    boolean updateOrder(Order order);

    boolean delete(String dId);

    boolean deleteOrder(String oId);

    OrderExt getOrderInfoById(String oId);

    List<OrderSource> getOrderSource();

    List<PayWay> getPayWay();

    Order get(String oId);
}
