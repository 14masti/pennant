/********************************DALclass.java**************************/

package com.reshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DALclass {
	Connection conn = null;
	PreparedStatement preparedStatement =null;
	Statement st = null;
	String qry, cs;
	ResultSet rst;
	public ArrayList<employee> fetchRecords(Connection conn,String name)
	{
		ArrayList<employee> l1=new ArrayList<>();
		try {
			
			String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
			String username = "plf_training_admin";
			String password = "pff123";
			

			
			Class.forName("org.postgresql.Driver");
			
			
			
			conn=DriverManager.getConnection(url,username,password);
			
			
			//st = conn.createStatement();
			
			
			qry = "select * from resh_emp where ename=?";
			
			preparedStatement = conn.prepareStatement(qry);
			preparedStatement.setString(1, name); 
			rst = preparedStatement.executeQuery();

			//rst = st.executeQuery(qry);
			
			
			while(rst.next()) {
				int empno = rst.getInt("empno");
				String ename = rst.getString("ename");
				String job = rst.getString("job");
				double sal=rst.getDouble("sal");
				employee e = new employee(empno, ename, job, sal);
				l1.add(e);
			}
	
			rst.close();
			
		}catch(Exception ex)
	{
			ex.printStackTrace();
		
		}
		return l1;	
	}
	public void insertEmployee(Connection conn, String empid, String employeeName, String job, String sal) throws NumberFormatException, SQLException {
		// TODO Auto-generated method stub

	        try {
	            String query = "INSERT INTO resh_emp (empno, ename, job, sal) VALUES (?, ?, ?, ?)";
	            preparedStatement = conn.prepareStatement(query);
	            preparedStatement.setInt(1, Integer.parseInt(empid));
	            preparedStatement.setString(2, employeeName);
	            preparedStatement.setString(3, job);
	            preparedStatement.setDouble(4, Double.parseDouble(sal));

	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	}
}


