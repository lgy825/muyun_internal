package com.muyun.core.dao.owner;

import com.muyun.core.model.owner.Owner;
import com.muyun.core.model.owner.OwnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OwnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int countByExample(OwnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int deleteByExample(OwnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int insert(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int insertSelective(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    List<Owner> selectByExample(OwnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    Owner selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Owner record, @Param("example") OwnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Owner record, @Param("example") OwnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Owner record);
}