//package tw.idv.tia202g1.web.entity;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//
//public class RolePermissionId implements Serializable {
//
//    private static final long serialVersionUID = -3571704539547448231L;
//
//    public Integer roleId;
//    public Integer permissionId;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof RolePermissionId)) {
//            return false;
//        }
//        RolePermissionId id = (RolePermissionId) o;
//        return Objects.equals(roleId, id.roleId)
//            && Objects.equals(permissionId, id.permissionId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(roleId, permissionId);
//    }
//}
