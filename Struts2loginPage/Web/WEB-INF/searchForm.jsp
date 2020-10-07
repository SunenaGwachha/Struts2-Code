<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
	<s:textfield label="Enter the language you wanr to search for" key="language"/>
	<s:submit/>
</s:form>

<%--
<form method="post" action="tutorials/getTutorial.action">
<input id="language" name="language"/>
<input id="submit"/>
</form>
--%>



</body>
</html>