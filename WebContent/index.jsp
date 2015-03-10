<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	
	
	<form action="Calc" method="post" name="frm" >
		<input name="operator1" id="number1"><br> 
		<input name="operator2" id="number2"><br>
		<select name="operation">
			<option>+</option>
			<option>-</option>
			<option>/</option>
			<option>*</option>
		</select>
		
			<input type="submit" value="Calculate">
		
	</form>
	
	${result}
	<br>
	${requestScope.result}
</body>
</html>
