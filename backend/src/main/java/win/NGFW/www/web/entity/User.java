package win.NGFW.www.web.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import win.NGFW.www.core.pojo.CoreMsg;

import java.sql.Timestamp;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends CoreMsg {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId; // Corresponds to USER_ID (auto-incremented)
	private String account; // Corresponds to ACCOUNT，use on register & login
	private String password; // Corresponds to PASSWORD
	private String name; // Corresponds to NAME，use on Estore
	private String email; // Corresponds to EMAIL
	private String phone; // Corresponds to PHONE
	private Integer status; // Corresponds to STATUS (Account active status)
	@Column(name = "ROLE_ID")
	private Integer roleId;
	private String oauth;
	@Column(name = "CREATE_TIME", insertable = false)
	private Timestamp createTime; // Corresponds to CREATE_DATE (Timestamp of creation)
	@ManyToOne
	@JoinColumn(name = "ROLE_ID", insertable = false, updatable = false)
	private Role role;
	private byte[] avatar;

	public User(Integer status, Integer roleId) {
		this.status = 0;
		this.roleId = roleId;
	}

//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//
//	public String getAccount() {
//		return account;
//	}
//
//	public void setAccount(String account) {
//		this.account = account;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public Boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(Boolean status) {
//		this.status = status;
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
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//
//	public String getOauth() {
//		return oauth;
//	}
//
//	public void setOauth(String oauth) {
//		this.oauth = oauth;
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
