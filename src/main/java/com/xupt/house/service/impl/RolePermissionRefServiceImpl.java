package com.xupt.house.service.impl;

import com.xupt.house.entity.RolePermissionRef;
import com.xupt.house.mapper.RolePermissionRefMapper;
import com.xupt.house.service.RolePermissionRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionRefServiceImpl implements RolePermissionRefService {

    @Autowired
    private RolePermissionRefMapper rolePermissionRefMapper;

    @Override
    public void deleteRefByRoleId(Long roleId) {
        rolePermissionRefMapper.deleteByRoleId(roleId);
    }

    @Override
    public void saveByRolePermissionRef(RolePermissionRef rolePermissionRef) {
        rolePermissionRefMapper.insert(rolePermissionRef);
    }

    @Override
    public void batchSaveByRolePermissionRef(List<RolePermissionRef> rolePermissionRefs) {
        rolePermissionRefMapper.batchInsert(rolePermissionRefs);
    }
}