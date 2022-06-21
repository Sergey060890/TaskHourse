<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.06.2022
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>

<%@ page import="java.util.Set" %>

<%@ page import="servlet.FlowerServlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page isELIgnored = "false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей Медвецкий
  Date: 25.05.2022
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>

<body>

<center>
    <h2>Hourses management</h2>
    <table border="3" width="50%">
        <tr>
            <th>Type</th>
            <th>Age</th>
            <th>Price</th>
            <th colspan="3"><center>Actions</center></th>
        </tr>

        <jsp:useBean id="hourses" scope="request" type="java.util.List"/>
        <c:forEach var="hourse" items="${hourses}">
            <tr>
                <td>${hourse.type}</td>
                <td>${hourse.age}</td>
                <td>${hourse.price}</td>

<%--                <td>--%>
<%--                    <a  href='<c:url value="select?id=${flower.id}" />'>SELECT</a>--%>
<%--                </td>--%>

<%--                <td>--%>
<%--                    <a  href='<c:url value="edit?id=${flower.id}" />'>EDIT FLOWER</a>--%>
<%--                </td>--%>

<%--                <td>--%>
<%--                    <a  href='<c:url value="delete?id=${flower.id}" />'>DELETE FLOWER</a>--%>
<%--                </td>--%>
            </tr>
        </c:forEach>

    </table>
<%--    <a  href="create">ADD HOURSE</a>--%>

    <a  href="index.jsp">BACK</a>

</center>
</body>
</html>