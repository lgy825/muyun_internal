package com.muyun.back.service.hourse;

import com.muyun.core.constant.GenericPage;
import com.muyun.core.model.hourse.Hourse;
import com.muyun.core.model.hourse.HourseExt;

import java.util.Map;

/**
 * Created by 13544 on 2019/5/20.
 */
public interface HourseService {

    public GenericPage<HourseExt> getPageByCondition(Map<String, Object> params);

    boolean insert(Hourse hourse);

    Hourse getHourseByIdById(String hId);

    Boolean update(Hourse hourse);

    boolean deleteByPrimaryKey(String hid);
}
