package com.muyun.core.dao.hourse;

import com.muyun.core.model.hourse.Hourse;
import com.muyun.core.model.hourse.HourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HourseMapperExt {


    int getHouseCountByCondition(String uId);
}