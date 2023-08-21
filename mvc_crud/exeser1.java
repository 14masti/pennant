
/****************************************exeser1.java******************************************/

package com.reshu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exeser1")
public class exeser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public exeser1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String employeeName = request.getParameter("employeeName");
		RequestDispatcher RD = null;
		try {
			DALclass dal = new DALclass();
			Connection conn = dal.getConnection(); // Get the connection
			ArrayList<employee> al = dal.fetchRecords(conn,employeeName);
			conn.close(); 
			request.setAttribute("data", al);
			RD = request.getRequestDispatcher("exe.jsp");
			RD.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String action = request.getParameter("action");
		if (action != null && action.equals("add")) {
		 // Handle adding new employee record
		String employeeName = request.getParameter("employeeName");
		String empid = request.getParameter("empid");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");

		try {
			DALclass dal = new DALclass();
			Connection conn = dal.getConnection();
		    dal.insertEmployee(conn,empid, employeeName, job, sal);
		    conn.close();
		    response.sendRedirect("exe.jsp");
		    } catch (Exception e) {
		    e.printStackTrace();
		    }
			
		        }
		    }
}

	

 
 
