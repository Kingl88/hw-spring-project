<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new employee</title>
</head>
<body>
<h3>Add new Employee</h3>
<c:url value="/employees" var="add_employee"/>
<form:form action="${add_employee}" method="post" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" type="text"/></td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="surname">Surname</form:label></td>
            <td><form:input path="surname" type="text"/></td>
            <td><form:errors path="surname" cssStyle="color: red"/></td>
        </tr>
    </table>
    <label> Department
        <select name="department">
            <c:forEach var="name" items="${departments}">
                <option value="${name.departmentName}">${name.departmentName}</option>
            </c:forEach>
        </select>
    </label>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</form:form>

</body>
</html>