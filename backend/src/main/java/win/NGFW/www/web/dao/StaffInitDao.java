package win.NGFW.www.web.dao;

import java.util.List;

import win.NGFW.www.web.entity.Staff;

public interface StaffInitDao {
	
	int staffInitInsert(Staff staff);
	
	Staff staffSelectForLogin(String staffEmail, String staffPassword);
	
	Staff selectByStaffEmail(String staffEmail);

	List<Staff> selectAllUser();

	Staff selectStaffById(Integer id);

	int updateStaff(Staff staff);
 
	Staff updateStaffSR(Staff staff);
}
