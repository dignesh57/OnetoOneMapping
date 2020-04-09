package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.EmpBean;
import com.Bean.EmpPersonInfo;
import com.Dao.EmpDao;

/**
 * Servlet implementation class ActionController
 */
@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionController() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Insert")) {
			
			EmpBean e=new EmpBean();
			EmpPersonInfo eid=new EmpPersonInfo();
			
			e.setUname(request.getParameter("uname"));
			eid.setFname(request.getParameter("fname"));
			eid.setEmail(request.getParameter("email"));
			eid.setAddress(request.getParameter("address"));
			e.setEpi(eid);
			//this is employee insert method
			EmpDao.insertEmp(e);
			
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("update")) {
			
			EmpBean e=new EmpBean();
			EmpPersonInfo eid=new EmpPersonInfo();
			
			e.setEmpid(Integer.parseInt(request.getParameter("empid")));
			e.setUname(request.getParameter("uname"));
			eid.setFname(request.getParameter("fname"));
			eid.setEmail(request.getParameter("email"));
			eid.setAddress(request.getParameter("address"));
			e.setEpi(eid);
			
			EmpDao.updateEmp(e);
			
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("updateEmp")) {
			
			int id=Integer.parseInt(request.getParameter("id"));
			EmpBean emp=EmpDao.getEmpById(id);
			
			HttpSession session=request.getSession();
			session.setAttribute("emp", emp);
			response.sendRedirect("updateEmp.jsp");
		}
		else if(action.equalsIgnoreCase("deleteEmp")) {
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			EmpDao.deleteEmp(id);
			response.sendRedirect("show.jsp");
		}
	}
}
