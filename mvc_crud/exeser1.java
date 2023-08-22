
/****************************************exeser1.java******************************************/

package com.reshu;

import java.io.IOException;
import java.sql.Connection;
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
       /* String employeeName = request.getParameter("employeeName");
        int empno = Integer.parseInt(request.getParameter("empno"));
        String job = request.getParameter("job");
        double sal = Double.parseDouble(request.getParameter("sal"));
        RequestDispatcher RD = null;
        try {
            DALclass dal = new DALclass();
            Connection conn = dal.getConnection(); // Get the connection
            ArrayList<employee> al = dal.fetchRecords(conn, employeeName, empno, job, sal);
//            conn.close();
            request.setAttribute("data", al);
            RD = request.getRequestDispatcher("exe.jsp");
            RD.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
	String employeeName = request.getParameter("employeeName");
	/*int empno = Integer.parseInt(request.getParameter("empno"));
	String job = request.getParameter("job");
	double sal = Double.parseDouble(request.getParameter("sal"));*/
	
	//RequestDispatcher RD = null;
	try {
		DALclass dal = new DALclass();
		Connection conn = dal.getConnection(); // Get the connection
		//ArrayList<employee> al = dal.fetchRecords(conn,employeeName,empno,job,sal);
		ArrayList<employee> al = dal.fetchRecords(conn,employeeName);
		request.setAttribute("data", al);
		RequestDispatcher RD = request.getRequestDispatcher("exe.jsp");
        RD.forward(request, response);
	} catch (Exception e) {
		e.printStackTrace();
	}

	String action = request.getParameter("action");

   
	if (action != null && action.equals("Display")) {
        // Handle display functionality
        try {
            DALclass dal = new DALclass();
            Connection conn = dal.getConnection();
            ArrayList<employee> allRecords = dal.fetchAllRecords(conn);
            //conn.close();
            request.setAttribute("data1", allRecords);
            RequestDispatcher RD = request.getRequestDispatcher("exe.jsp");
            RD.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
        } 
   

    
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Call the common method to process the request
        
        String action = request.getParameter("action");

        if (action != null && action.equals("ADD")) {
            String employeeName = request.getParameter("employeeName");
            String empid = request.getParameter("empno");
            String job = request.getParameter("job");
            String sal = request.getParameter("sal");

            try {
                DALclass dal = new DALclass();
                Connection conn = dal.getConnection();
                dal.insertEmployee(conn, empid, employeeName, job, sal);
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    
    /*else if (action != null && action.equals("delete")) {
    String empidToDelete = request.getParameter("empid");
    try {
        DALclass dal = new DALclass();
        Connection conn = dal.getConnection();
        dal.deleteEmployee(conn, empidToDelete);
        conn.close();
        response.sendRedirect("exeser1"); // Redirect to refresh the page
    } catch (Exception e) {
        e.printStackTrace();
    }
} */
    }
}
