//package tw.idv.tia202g1.web.service.impl;
//
//import org.springframework.stereotype.Service;
//import tw.idv.tia202g1.web.dao.RoleDao;
//import tw.idv.tia202g1.web.dao.UserDao;
//import tw.idv.tia202g1.web.dao.impl.RoleDaoImpl;
//import tw.idv.tia202g1.web.dao.impl.UserDaoImpl;
//import tw.idv.tia202g1.web.entity.Role;
//import tw.idv.tia202g1.web.service.RoleService;
//
//import jakarta.naming.NamingException;
//import java.util.List;
//
//@Service
//public class RoleServiceImpl implements RoleService {
//    private final RoleDao roleDao;
//
//    public RoleServiceImpl() throws NamingException {
//        roleDao = new RoleDaoImpl();
//    }
//
//    @Override
//    public boolean selectByRoleType(String roleType) {
//        Role role = roleDao.selectByRoleType(roleType);
//        return  role != null;
//    }
//
//    @Override
//    public boolean selectByRoleId(int roleId) {
//        Role role = roleDao.selectByRoleId(roleId);
//        return  role != null;
//    }
//
//    @Override
//    public List<Role> findAll() {
//        return roleDao.selectAll();
//    }
//}
