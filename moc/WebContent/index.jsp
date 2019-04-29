<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="EmployeeServlet" method="post">
<div>

<label>Employee id:</label>
<input type ="text" name="id"/>
</div>

<div>

<label>Employee name:</label>
<input type ="text" name="name"/>
</div>

<div>

<label>Salary:</label>
<input type ="text" name="salary"/>
</div>

<div>

<label>Gender:</label>
<select name="gender">
<option>--select</option>
<option value="male">Male</option>
<option value="female">Female</option>

</select>

</div>

<div>

<label>Address:</label>
<input type ="text" name="address"/>
</div>

<div>
<button>save</button>
</div>

</form>
</body>
</html>