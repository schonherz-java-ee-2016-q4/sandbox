<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Funky Webshop</title>
        <link href="/resources/css/style.css" rel="stylesheet"/>
    </head>
    <body>
        <c:forEach items="${products}" var="item">
        ${item.name}
        ${item.description}
        ${item.url} <br>  
                </c:forEach>
    </body>
</html>