package com.muyun.core.dao.order;

import com.muyun.core.model.order.OrderSource;
import com.muyun.core.model.order.OrderSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int countByExample(OrderSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int deleteByExample(OrderSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int insert(OrderSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int insertSelective(OrderSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    List<OrderSource> selectByExample(OrderSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    OrderSource selectByPrimaryKey(String sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OrderSource record, @Param("example") OrderSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OrderSource record, @Param("example") OrderSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yunmu_order_source
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderSource record);

    List<OrderSource> getOrderSourceAll();
}