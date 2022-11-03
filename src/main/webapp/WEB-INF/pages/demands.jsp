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
        <title>Mes demandes ${depotName}</title>
    </head>
    <body>
        <c:if test="${products != null}">
            Les dépôts:
            <ul>
                <c:forEach items="${products}" var="product">
                    <li>${product.name} ${product.stock} ${demands}</li>
                </c:forEach>
            </ul>
        </c:if>

        <form action="${pageContext.request.contextPath}/demands" method="post">
            <label for="nameProduct">Nom du produit:</label><br>
            <input type="text" id="nameProduct" name="nameProduct"><br>
            <label for="demands">Quantité demandé:</label><br>
            <input type="text" id="demands" name="demands" value="${demandMake}"><br><br>
            <input type="submit" value="demande">
        </form>

        <c:if test="${errors != null}">--%>
            Erreurs:
            <ul>
                <c:forEach items="${errors}" var="error">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </c:if>
    </body>
</html>
