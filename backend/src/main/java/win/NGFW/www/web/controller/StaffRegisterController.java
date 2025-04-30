package win.NGFW.www.web.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import win.NGFW.www.web.entity.Staff;
import win.NGFW.www.web.service.StaffInitService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/staff_register")
public class StaffRegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StaffInitService service;

    @Override
    public void init() throws ServletException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        service = context.getBean(StaffInitService.class);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Gson gson = new Gson();
        Staff staff = gson.fromJson(req.getReader(), Staff.class);

        String errMsg = service.staffRegister(staff);

        JsonObject respBody = new JsonObject();
        respBody.addProperty("successfully", errMsg == null);
        respBody.addProperty("errMsg", errMsg);
        resp.getWriter().write(respBody.toString());
    }
}
