package com.muyun.back.service.owner.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.muyun.back.controller.IndexController;
import com.muyun.back.service.owner.OwnerService;
import com.muyun.core.base.Result;
import com.muyun.core.constant.GenericPage;
import com.muyun.core.dao.hourse.HourseMapperExt;
import com.muyun.core.dao.owner.OwnerMapper;
import com.muyun.core.dao.owner.OwnerMapperExt;
import com.muyun.core.exception.DataException;
import com.muyun.core.model.owner.Owner;
import com.muyun.core.model.owner.OwnerExt;
import com.muyun.core.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by 13544 on 2019/5/19.
 */
@Service
public class OwnerServiceImpl implements OwnerService {

    private static  final Logger log= LoggerFactory.getLogger(OwnerServiceImpl.class);

    @Autowired
    private OwnerMapperExt ownerMapperExt;

    @Autowired
    private HourseMapperExt hourseMapperExt;
    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public GenericPage<OwnerExt> getPageByCondition(Map<String, Object> params) {
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
        List<OwnerExt> ownerExtList=ownerMapperExt.getOwnerPage(params);

        for(OwnerExt ownerExt:ownerExtList){
            int count=hourseMapperExt.getHouseCountByCondition(ownerExt.getId());
            ownerExt.setrCount(count);
        }
        return new GenericPage<>(pageIndex, pageSize, ownerExtList, pageInfo.getTotal());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean insert(Owner owner) {

        if(owner!=null){
            try {
                //给用户的密码进行加密
                owner.setuPwd(MD5Util.getEncryptedPwd(owner.getuPwd()));
            } catch (Exception e) {
                log.error("加密密码失败:"+ owner.getuPwd(), e);
                throw new DataException("保存用户失败");
            }
            owner.setToken(0);
            owner.setuStatus(1);
            owner.setuDate(new Date());

            try {
                ownerMapper.insert(owner);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
