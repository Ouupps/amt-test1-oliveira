<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 03.11.2022
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Tout les dépôts</title>
    </head>
    <body>
        <c:if test="${depots != null}">
            Les dépôts:
            <ul>
                <c:forEach items="${depots}" var="depot">
                    <li>${depot.name} <a href="demands?depotName=${depot.name}&id=${depot.id}">Mes demandes</a> <a href="other?depotName=${depot.name}&id=${depot.id}"> Autres demandes</a></li>
                </c:forEach>
            </ul>
        </c:if>
    </body>
</html>
