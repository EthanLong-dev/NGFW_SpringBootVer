//package tw.idv.tia202g1.web.service.impl;
//
//import org.springframework.stereotype.Service;
//import tw.idv.tia202g1.web.dao.PermissionDao;
//import tw.idv.tia202g1.web.dao.impl.PermissionDaoImpl;
//import tw.idv.tia202g1.web.entity.Permission;
//import tw.idv.tia202g1.web.service.PermissionService;
//
//import jakarta.naming.NamingException;
//import java.util.List;
//@Service
//public class PermissionServiceImpl implements PermissionService {
//    private final PermissionDao permissionDao;
//
//    public PermissionServiceImpl() throws NamingException {
//        permissionDao = new PermissionDaoImpl();
//    }
//
//    @Override
//    public boolean selectByPermissionId(int permissionId) {
//        Permission permission = permissionDao.selectByPermissionId(permissionId);
//        return permission != null;
//    }
//
//    @Override
//    public boolean selectByPermissionType(String permissionType) {
//        Permission permission = permissionDao.selectByPermissionType(permissionType);
//        return permission != null;
//    }
//
//    @Override
//    public List<Permission> findAll() {
//        return permissionDao.selectAll();
//    }
//}
