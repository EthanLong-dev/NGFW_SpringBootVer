package win.NGFW.www.web.service;

import java.util.List;

import win.NGFW.www.web.entity.Staff;

public interface StaffInitService {
	
	String staffRegister(Staff staff);

	Staff staffLogin(Staff staff);

	List<Staff> findAllStaff();

	Staff selectById(Integer id);

	Staff editStaff(Staff staff);
	
	Staff editStaffSR(Staff staff);
}
