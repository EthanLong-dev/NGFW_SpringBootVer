package win.NGFW.www.web.dao;

import win.NGFW.www.web.entity.RolePermission;

import java.util.List;

public interface RolePermissionDao {
    int addRolePermission(RolePermission rolePermission);

    // 僅就role_permission表格操作
    int deleteRolePermission(int roleId);

    int updateRolePermission(RolePermission rolePermission);

    RolePermission findRolePermissionByRoleId(int roleId);

    List<RolePermission> findAllRolePermissions();
}
