<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 03.11.2022
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Mes demandes</title>
    </head>
    <body>
        <c:if test="${products != null}">
            Les dépôts:
            <ul>
                <c:forEach items="${products}" var="product">
                    <li>${product.name} ${product.stock} ${product.demands}</li>
                </c:forEach>
            </ul>
        </c:if>
    </body>
</html>
