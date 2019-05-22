package com.muyun.back.service.hourse.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.muyun.back.service.hourse.HourseService;
import com.muyun.back.service.owner.OwnerService;
import com.muyun.core.constant.GenericPage;
import com.muyun.core.dao.hourse.HourseMapper;
import com.muyun.core.dao.hourse.HourseMapperExt;
import com.muyun.core.model.hourse.Hourse;
import com.muyun.core.model.hourse.HourseExt;
import com.muyun.core.model.owner.OwnerExt;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/20.
 */
@Service
public class HourseServiceImpl implements HourseService {

    @Autowired
    private HourseMapperExt hourseMapperExt;

    @Autowired
    private HourseMapper hourseMapper;

    @Autowired
    private OwnerService ownerService;
    @Override
    public GenericPage<HourseExt> getPageByCondition(Map<String, Object> params) {
        int pageIndex = 1, pageSize = 10;
        if(params.containsKey("pageIndex")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageIndex").toString())) {
                pageIndex = Integer.valueOf(params.get("pageIndex").toString());
                if(pageIndex < 1) {
                    pageIndex = 1;
                }
            }
        }
        if(params.containsKey("pageSize")) {
            if(params.get("pageIndex") != null &&
                    StringUtils.isNotBlank(params.get("pageSize").toString())) {
                pageSize = Integer.valueOf(params.get("pageSize").toString());
                if(pageSize < 1) {
                    pageSize = 10;
                }
            }
        }
        Page<OwnerExt> pageInfo = PageHelper.startPage(pageIndex, pageSize, true);
        List<HourseExt> hourseExts=hourseMapperExt.getHoursePage(params);
        for(HourseExt ownerExt:hourseExts){
            ownerExt.setuRealName(ownerService.getOwnerRealName(ownerExt.getuId()));
        }
        return new GenericPage<>(pageIndex, pageSize, hourseExts, pageInfo.getTotal());
    }

    @Override
    public boolean insert(Hourse hourse) {
        if(hourse!=null) {
            hourse.sethDate(new Date());
            try {
                hourseMapper.insert(hourse);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override
    public Hourse getHourseByIdById(String hId) {
        return hourseMapper.selectByPrimaryKey(hId);
    }

    @Override
    public Boolean update(Hourse hourse) {
        try {
            hourse.sethDate(new Date());
            hourseMapper.updateByPrimaryKeySelective(hourse);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteByPrimaryKey(String hid) {
        try {
            hourseMapper.deleteByPrimaryKey(hid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
