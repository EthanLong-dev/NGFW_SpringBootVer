package win.NGFW.www.web.dao;

import win.NGFW.www.web.entity.Permission;

import java.util.List;

public interface PermissionDao {
    List<Permission> selectAll();

    Permission selectByPermissionId(int permissionId);

    Permission selectByPermissionType(String permissionTypr);
}
