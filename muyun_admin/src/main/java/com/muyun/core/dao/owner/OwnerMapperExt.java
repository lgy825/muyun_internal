package com.muyun.core.dao.owner;

import com.muyun.core.model.owner.Owner;
import com.muyun.core.model.owner.OwnerExample;
import com.muyun.core.model.owner.OwnerExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OwnerMapperExt {

    List<OwnerExt> getOwnerPage(Map<String,Object> params);
}