package win.NGFW.www.web.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import win.NGFW.www.core.pojo.CoreMsg;


//@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class Permission extends CoreMsg {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERMISSION_ID")
	private Integer permissionId;
	@Column(name = "PERMISSION_TYPE")
	private String permissionType;
	@Column(name = "CREATE_TIME", insertable = false)
	private Timestamp createTime;
}
