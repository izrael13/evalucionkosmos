<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>consultorios</title>
</head>
<body>
 <div>
        <div>
            <h2>Lista consultorios</h2>
            <hr/>
            <a href="/grabarconsultorio">
                Agregar consultorio
            </a>
            <br/><br/>
            <div>
                <div>
                    <div>Lista consultorios</div>
                </div>
                <div>
                    <table>
                        <tr>
                            <th>Id</th>
                            <th>Numero</th>
                            <th>Piso</th>
                        </tr>
                        <c:forEach var="d" items="${lista}">
                            <tr>
                                <td>${d.numero}</td>
                                <td>${d.piso}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div><a href="/">Main</a></div>
</body>
</html>