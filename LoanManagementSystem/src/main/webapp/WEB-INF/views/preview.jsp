<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 8px;
        }
        table {
            border-collapse: collapse;
            width: 50%;
            
            margin-top: 15px;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
            text-align: center;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
 <!--  form action="submitForm" method="post"-->
<h1>customer data</h1>
    <table border="1">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Customer ID</td>
            <td>${loanlist.custid}</td>
        </tr>
        <tr>
            <td>Customer First Name</td>
            <td>${loanlist.custfirstname}</td>
        </tr>
        <tr>
            <td>Customer Last Name</td>
            <td>${loanlist.custlastname}</td>
        </tr>
         <tr>
            <td>Customer DOB</td>
            <td>${loanlist.custdob}</td>
        </tr>
        <tr>
            <td>Customer pann number</td>
            <td>${loanlist.custpanno}</td>
        </tr>
        <tr>
            <td>Customer Mobile number</td>
            <td>${loanlist.custmobile}</td>
        </tr>
        <tr>
            <td>Customer DOB</td>
            <td>${loanlist.custaddress}</td>
        </tr>
        <tr>
            <td>Customer gardian name</td>
            <td>${loanlist.custgname}</td>
        </tr>
        <tr>
            <td>Customer Update date</td>
            <td>${loanlist.custluudate}</td>
        </tr>
        <tr>
            <td>Customer User</td>
            <td>${loanlist.custluser}</td>
        </tr>

    </table>
    
    
    
   <h1>LoanApplicantNominees</h1>
   <table border="1">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Nominees ID</td>
            <td>${loanlist.lnapid1}</td>
        </tr>
        <tr>
            <td>Nominees Name</td>
            <td>${loanlist.lnapnominee}</td>
        </tr>
        <tr>
            <td>Relationship with Applicant</td>
            <td>${loanlist.lnaprelation}</td>
        </tr>
         
    </table>
    
   
    <h1>LoanApplicant</h1>
    <table border="1">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Loan Applicant ID</td>
            <td>${loanlist.lnapid2}</td>
        </tr>
        <tr>
            <td>Customer ID</td>
            <td>${loanlist.lnapcustid}</td>
        </tr>
        <tr>
            <td>Application Date</td>
            <td>${loanlist.lnapapdate}</td>
        </tr>
         <tr>
            <td>Loan Type ID</td>
            <td>${loanlist.lnaplntyid}</td>
        </tr>
        <tr>
            <td>Loan Amount</td>
            <td>${loanlist.lnapamount}</td>
        </tr>
        <tr>
            <td>EMI Range From</td>
            <td>${loanlist.lnapemirangefrom}</td>
        </tr>
         <tr>
            <td>EMI Range To</td>
            <td>${loanlist.lnapemirangeto}</td>
        </tr>
        <tr>
            <td>Nominee Requested Amount</td>
            <td>${loanlist.lnapnomrequested}</td>
        </tr>
        <tr>
            <td>CIBIL Score</td>
            <td>${loanlist.lnapcibilscore}</td>
        </tr>
        <tr>
            <td>Status</td>
            <td>${loanlist.lnapstatus}</td>
        </tr>
        <tr>
            <td>Conclusion Remarks</td>
            <td>${loanlist.lnapconclusionremarks}</td>
        </tr>
        <tr>
            <td>Processed User</td>
            <td>${loanlist.lnapprocesseduser}</td>
        </tr>
        <tr>
            <td>Processed Date</td>
            <td>${loanlist.lnapprocessedDate}</td>
        </tr>

    </table>
    
   <form action="submitForm" method="post">
        <button type="submit">edit</button>
    </form>
    
    <form action="saveform" method="post">
        <button type="submit">save</button>
    </form>

</body>
</html>