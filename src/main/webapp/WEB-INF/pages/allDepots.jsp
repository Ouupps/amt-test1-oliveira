<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 03.11.2022
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Tout les dépôts</title>
    </head>
    <body>
        <c:if test="${depots != null}">
            Les dépôts:
            <ul>
                <c:forEach items="${depots}" var="depot">
                    <li>${depot.name}</li>
                    <li><a href="demande">Mes demandes</a></li>
                    <li><a href="other"> Autres demandes</a></li>
                </c:forEach>
            </ul>
        </c:if>
    </body>
</html>
