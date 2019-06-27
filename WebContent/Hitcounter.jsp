<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Integer countr=(Integer)application.getAttribute("numberOfVisits");
if( countr==null|| countr==0)
{
	countr=1;
}
else
{
	countr=countr+1;
}
application.setAttribute("numberOfVisits",countr);
%>
<h3> Total number of hits to this page is : <%=countr %></h3>

</body>
</html>