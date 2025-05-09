package win.NGFW.www.web.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import win.NGFW.www.core.pojo.CoreMsg;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Role extends CoreMsg {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID")
	private Integer roleId;
	@Column(name = "ROLE_TYPE")
	private String roleType;
	
//	@JoinColumn(name = "ROLE_ID", insertable = false, updatable = false)
//	private List<RolePermission> rolePermission;
	
	@Column(name = "CREATE_TIME", insertable = false)
	private Timestamp createTime;
	
//	public Role() {
//	}
//
//	public Integer getRoleId() {
//		return roleId;
//	}
//
//	public void setRoleId(Integer roleId) {
//		this.roleId = roleId;
//	}
//
//	public String getRoleType() {
//		return roleType;
//	}
//
//	public void setRoleType(String roleType) {
//		this.roleType = roleType;
//	}
//
//	public Timestamp getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(Timestamp createTime) {
//		this.createTime = createTime;
//	}
}
