package com.muyun.back.service.impl;

import com.muyun.back.service.AdminService;
import com.muyun.core.dao.admin.AdminMapperExt;
import com.muyun.core.model.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 13544 on 2019/5/19.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapperExt adminMapperExt;
    @Override
    public boolean loginVali(Admin admin) {
        int isLogin=adminMapperExt.loginVali(admin);
        if(isLogin>0){
            return true;
        }
        return false;
    }
}
