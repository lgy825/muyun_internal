package com.muyun.core.dao.owner;

import com.muyun.core.model.owner.Owner;
import com.muyun.core.model.owner.OwnerExt;

import java.util.List;
import java.util.Map;

public interface OwnerMapperExt {

    List<OwnerExt> getOwnerPage(Map<String, Object> params);

    String getOwnerRealNameById(String id);

    OwnerExt getOwnerByCondition(Owner owner);


}