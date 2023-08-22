/********************************DALclass.java**************************/

package com.reshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DALclass {
	
	String qry, cs;

	public Connection getConnection() {
        Connection conn = null;
        try {
        	String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
			String username = "plf_training_admin";
			String password = "pff123";

            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
	
	
	public ArrayList<employee> fetchRecords(Connection conn,String name)
	{
		ArrayList<employee> l1=new ArrayList<>();
		PreparedStatement preparedStatement =null;
		ResultSet rst;
		try {
			qry = "select * from resh_emp where ename=?";
			preparedStatement = conn.prepareStatement(qry);
			preparedStatement.setString(1, name); 
			rst = preparedStatement.executeQuery();
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
	
	
	/*public ArrayList<employee> fetchRecords(Connection conn,String employeeName,int empno,String job,double sal) {
	    ArrayList<employee> l1 = new ArrayList<>();
	    PreparedStatement preparedStatement = null;
	    ResultSet rst;

	    try {
	        String qry = "SELECT * FROM resh_emp WHERE ename ILIKE ? OR empno::TEXT ILIKE ? OR job ILIKE ? OR sal::TEXT ILIKE ?";
	        preparedStatement = conn.prepareStatement(qry);


	        preparedStatement.setString(1, "%" + employeeName + "%");
	        preparedStatement.setString(2, "%" + empno + "%");
	        preparedStatement.setString(3, "%" + job + "%");
	        preparedStatement.setString(4, "%" + sal + "%");

	        rst = preparedStatement.executeQuery();

	        while (rst.next()) {
	            int empno1 = rst.getInt("empno");
	            String ename1 = rst.getString("ename");
	            String job1 = rst.getString("job");
	            double sal1 = rst.getDouble("sal");
	            employee e = new employee(empno1, ename1, job1, sal1);
	            l1.add(e);
	        }

	        rst.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return l1;
	}
*/
	
	public void insertEmployee(Connection conn, String empno, String employeeName, String job, String sal) throws NumberFormatException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement =null;
	        try {
	            String query = "INSERT INTO resh_emp (empno, ename, job, sal) VALUES (?, ?, ?, ?)";
	            preparedStatement = conn.prepareStatement(query);
	            preparedStatement.setInt(1, Integer.parseInt(empno));
	            preparedStatement.setString(2, employeeName);
	            preparedStatement.setString(3, job);
	            preparedStatement.setDouble(4, Double.parseDouble(sal));
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	}

	public ArrayList<employee> fetchAllRecords(Connection conn) {
	    ArrayList<employee> allRecords = new ArrayList<>();
	    PreparedStatement preparedStatement = null;
	    ResultSet rst;
	    try {
	        String qry = "SELECT * FROM resh_emp";
	        preparedStatement = conn.prepareStatement(qry);
	        rst = preparedStatement.executeQuery();
	        while (rst.next()) {
	            int empno = rst.getInt("empno");
	            String ename = rst.getString("ename");
	            String job = rst.getString("job");
	            double sal = rst.getDouble("sal");
	            employee e = new employee(empno, ename, job, sal);
	            allRecords.add(e);
	        }
	        rst.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return allRecords;
	}

	/*public void deleteEmployee(Connection conn, String empid) throws SQLException {
	    String query = "DELETE FROM reshu_emp WHERE empid=?";
	    try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	        preparedStatement.setInt(1, Integer.parseInt(empid));
	        preparedStatement.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}*/
}
