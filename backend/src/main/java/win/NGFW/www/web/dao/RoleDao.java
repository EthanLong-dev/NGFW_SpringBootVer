package win.NGFW.www.web.dao;

import win.NGFW.www.web.entity.Role;

import java.util.List;

public interface RoleDao {
//    int update();

    Role selectByRoleType(String roleType);

    Role selectByRoleId(int roleId);

    List<Role> selectAll();
}
