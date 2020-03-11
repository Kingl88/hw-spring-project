<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<c:forEach var="department" items="${department}">
    <table>
        <tr>
            <td><label>#</label></td>
            <td><c:out value="${department.departmentId}"/></td>
        </tr>
        <tr>
            <td><label>Name</label></td>
            <td><c:out value="${department.departmentName}"/></td>
        </tr>
    </table>
</c:forEach>
</body>
</html>