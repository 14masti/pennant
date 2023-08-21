/*************************exe.jsp**********************************/

<%@ page language="java" import="java.io.*, java.util.*, com.reshu.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Employee details</h1>
<form action="exeser1" method="post">
    Employee Name:
    <input type="text" id="ename" name="employeeName"><br><br>
    
    Employee id:
    <input type="text" id="empid" name="empid"><br><br>
    
    Employee job:
    <input type="text" id="job" name="job"><br><br>
    
    Employee salary:
    <input type="text" id="sal" name="sal"><br><br>
    

    <input type="submit" value="Search">
    <input type="submit" value="ADD">
    
</form>

 <table border="1">
        <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Job Role</th>
            <th>Salary</th>
        </tr>
        <%
            ArrayList<employee> elist = (ArrayList<employee>) request.getAttribute("data");
           
            for (employee empObj : elist) {
        %>
        <tr>
            <td><%= empObj.getEmpid() %></td>
            <td><%= empObj.getEname() %></td>
            <td><%= empObj.getJob() %></td>
            <td><%= empObj.getSal() %></td>
            <td><button type="button" >EDIT</td>
            <td><button type="button">DELETE</td>
        </tr>
        <% }
            
        %>
       
         
      
    </table>
</body>
</html>
