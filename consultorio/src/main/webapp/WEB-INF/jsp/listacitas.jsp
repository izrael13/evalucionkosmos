<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Citas</title>
</head>
<body>
 <div>
        <div>
            <h2>Citas</h2>
            <hr/>
            <a href="/grabarcita">
                Agregar Citas
            </a>
            <br/><br/>
            <div>
                <div>
                    <div>Lista Citas</div>
                </div>
                <div>
                    <table>
                        <tr>
                            <th>Id</th>
                            <th>Consultorio</th>
                            <th>Doctor</th>
                            <th>Fecha</th>
                            <th>Horario</th>
                            <th>Paciente</th>
                        </tr>
                        <c:forEach var="d" items="${lista}">
                            <tr>
                                <td>${d.id}</td>
                                <td>${d.idConsultorio}</td>
                                <td>${d.idDoctor}</td>
                                <td>${d.fecha}</td>
                                <td>${d.hora}</td>
                                <td>${d.paciente}</td>
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