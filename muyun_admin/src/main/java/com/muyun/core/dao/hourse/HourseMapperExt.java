package com.muyun.core.dao.hourse;

import com.muyun.core.model.hourse.HourseExt;

import java.util.List;
import java.util.Map;

public interface HourseMapperExt {


    int getHouseCountByCondition(String uId);

    List<HourseExt> getHoursePage(Map<String, Object> params);

}