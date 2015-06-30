<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
<h1>Sample Table</h1>
<table class="rwd-table">
  <tr>
    <th>C1</th>
    <th>C2</th>
  </tr>
 <c:forEach var="i" items="#{t1s}">
  <tr>
    <td data-th="Movie Title"> <c:out value="${i.c1}"/></td>
    <td data-th="Genre"><c:out value="${i.c2}"/></td>
  </tr>
</c:forEach>
  
</table>
</body>
</html>