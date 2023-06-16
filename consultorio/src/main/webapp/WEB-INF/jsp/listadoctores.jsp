<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista doctores</title>
</head>
<body>
  <div>
        <div>
            <h2>Lista doctores</h2>
            <hr/>
            <a href="/grabardoctor">
                Agregar doctor
            </a>
            <br/><br/>
            <div>
                <div>
                    <div>Lista doctores</div>
                </div>
                <div>
                    <table>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellido paterno</th>
                            <th>Apellido materno</th>
                            <th>Especialidad</th>
                        </tr>
                        <c:forEach var="d" items="${lista}">
                            <tr>
                                <td>${d.id}</td>
                                <td>${d.nombre}</td>
                                <td>${d.paterno}</td>
                                <td>${d.materno}</td>
                                <td>${d.especialidad}</td>
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