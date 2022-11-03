
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Test n° 1</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/" method="post">
            <label for="fname">First name:</label><br>
            <input type="text" id="fname" name="fname" value="John"><br>
            <label for="lname">Last name:</label><br>
            <input type="text" id="lname" name="lname" value="Doe"><br><br>
            <input type="submit" value="Submit">
        </form>
        <a> ${nameUser} </a>
        <a> fdsdf </a>

        <form action="${pageContext.request.contextPath}/users" method="get">
            <input type="submit" value="get users">
        </form>
        <c:if test="${users != null}">
            <c:forEach items="${users}" var="user">
                <p>${user.firstname} ${user.lastname}</p>
            </c:forEach>
        </c:if>

        <c:if test="${errors != null}">
            Erreurs:
            <ul>
                <c:forEach items="${errors}" var="error">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </c:if>
    </body>
</html>