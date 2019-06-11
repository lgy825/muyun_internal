package com.muyun.bapp.service;

import com.muyun.core.model.order.OrderExt;
import com.muyun.core.util.AppResponseObj;

import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/25.
 */
public interface AppService {

    Map<String,Object> getDateByCondition(Map<String,String> params);

    double getIncomeByCondition(Map<String,String> params);

    List<AppResponseObj> getOrderPage(Map<String,String> params);

    OrderExt getOrderInfoById(String oId);
}
