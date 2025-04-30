package win.NGFW.www.web.service;

import win.NGFW.www.web.entity.Role;

import java.util.List;

public interface RoleService {

    boolean selectByRoleType(String roleType);

    boolean selectByRoleId(int roleId);

    List<Role> findAll();
}
