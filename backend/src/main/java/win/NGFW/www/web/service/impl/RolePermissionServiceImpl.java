//package tw.idv.tia202g1.web.service.impl;
//
//import org.springframework.stereotype.Service;
//import tw.idv.tia202g1.web.dao.RolePermissionDao;
//import tw.idv.tia202g1.web.dao.impl.RolePermissionDaoImp;
//import tw.idv.tia202g1.web.entity.RolePermission;
//import tw.idv.tia202g1.web.service.RolePermissionService;
//
//import jakarta.naming.NamingException;
//@Service
//public class RolePermissionServiceImpl implements RolePermissionService {
//    private final RolePermissionDao rolePermissionDao;
//
//    public RolePermissionServiceImpl() throws NamingException {
//        rolePermissionDao = new RolePermissionDaoImp();
//    }
//
//    @Override
//    public int updateRolePermission(RolePermission rolePermission) {
//        return rolePermissionDao.updateRolePermission(rolePermission);
//    }
//}
