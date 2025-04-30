package win.NGFW.www.web.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

//@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class RolePermission {
	
	@Column(name = "ROLE_ID")
	private Integer roleId;
	@JoinColumn(name = "ROLE_ID", insertable = false, updatable = false)
	private List<Role> role;
	
	@Column(name = "PERMISSION")
	private Integer permissionId;
	@JoinColumn(name = "PERMISSON_ID", insertable = false, updatable = false)
	private List<Permission> permission;
}
