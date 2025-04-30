package win.NGFW.www.web.service;

import win.NGFW.www.web.entity.Permission;

import java.util.List;

public interface PermissionService {
    boolean selectByPermissionId(int permissionId);

    boolean selectByPermissionType(String permissionType);

    List<Permission> findAll();
}
