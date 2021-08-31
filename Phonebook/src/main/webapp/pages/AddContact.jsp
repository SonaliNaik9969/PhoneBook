<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Contact Details</title>
</head>
<body bgcolor="#ffe0b3">
<h1><center> Add New Contact </center></h1>
<f:form action="save" modelAttribute="cont" method="get" >
<table align="center" border="1">

<tr>
<td> Contact_ID :  <f:input path="id"/> <br> </td>
</tr>

<tr>
<td> Contact_Name : <f:input path="name"/> <br> </td>
</tr>

<tr>
<td> Contact_Email : <f:input path="email"/> <br> </td>
</tr>

<tr>
<td> Contact_No. : <f:input path="mobile"/> <br> </td>
</tr>

<tr>
<td align="center"> <input type="submit" value="save"></td>
</tr>

</table>
</f:form>
</body>
</html>