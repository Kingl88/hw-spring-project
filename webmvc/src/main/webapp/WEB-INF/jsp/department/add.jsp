<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new employee</title>
</head>
<body>
<h3>Add new Employee</h3>
<c:url value="/departments" var="add_department"/>
<form:form action="${add_department}" method="post" modelAttribute="department">
    <table>
        <tr>
            <td><form:label path="departmentName">Department_Name</form:label></td>
            <td><form:input path="departmentName" type="text"/></td>
            <td><form:errors path="departmentName"/></td>
        </tr>
        <tr>
            <td colspan="1">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>