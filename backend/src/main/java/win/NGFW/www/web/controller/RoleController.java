//package tw.idv.tia202g1.web.controller;
//
//import com.google.gson.Gson;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import tw.idv.tia202g1.web.entity.Permission;
//import tw.idv.tia202g1.web.entity.Role;
//import tw.idv.tia202g1.web.service.RoleService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("role")
//public class RoleController {
//    @Autowired
//    private RoleService service;
//
//    @GetMapping("test")
//    public String test() {
//        return "test ok";
//    }
//
//    @GetMapping("roleid")
//    public boolean getRoleByRoleId(int roleId) {
//        return service.selectByRoleId(roleId);
//    }
//
//    @GetMapping("roletype")
//    public boolean getRoleByRoleType(String roleType) {
//        return service.selectByRoleType(roleType);
//    }
//
//    @GetMapping("roleall")
//    public List<Role> getAll() {
//        return service.findAll();
//    }
//
//    @GetMapping("roleupdata")
//    public boolean updateRoleByRoleId(int roleId) {
//
//    }
//
//
//
//}
