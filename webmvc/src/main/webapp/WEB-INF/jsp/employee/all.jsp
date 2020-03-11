<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<c:forEach var="employee" items="${employees}">
    <table>
        <tr>
            <td><label>#</label></td>
            <td><c:out value="${employee.id}"/></td>
        </tr>
        <tr>
            <td><label>Name</label></td>
            <td><c:out value="${employee.name}"/></td>
        </tr>
        <tr>
            <td><label>Surname</label></td>
            <td><c:out value="${employee.surname}"/></td>
        </tr>
        <tr>
            <td><label>Date</label></td>
            <td><c:out value="${employee.date}"/></td>
        </tr>
        <tr>
            <td><label>Department</label></td>
            <td><c:out value="${employee.department}"/></td>
        </tr>
    </table>
</c:forEach>
</body>
</html>