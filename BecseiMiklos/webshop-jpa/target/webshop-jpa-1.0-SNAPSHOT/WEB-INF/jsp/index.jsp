<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Funky Webshop</title>
        <link href="/resources/css/style.css" rel="stylesheet"/>
    </head>
    <body>

    <c:forEach items="${products}" var="item">
        <h4>${item.name}</h4>
        <i>${item.description}</i><br>
        ${item.url}<br>
    </c:forEach>

    </body>
</html>