<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grabar cita</title>
</head>
<body>
      <h2>Nueva cita</h2>
        <div>
            <div>
            ${consultorios}
                <form:form action="/grabarcita" modelAttribute="cita" method="post">
                    <div>
                        <div>
                            <div>Consultorio</div>
                            <form:select id="Sconsult" path="idConsultorio" multiple="false" class="border border-primary form-control campo">
							<form:option value="0">Seleccione un consultorio</form:option>
								<c:forEach var="c" items="${consultorios}">
									<form:option value="${c.id}"><c:out value="${c.numero}- ${c.piso}"/></form:option>
								</c:forEach> 
							</form:select>
                            <form:errors path="idConsultorio" />
                        </div>
                        <div>
                            <form:label path="idDoctor">Doctor</form:label>
                            
                            <form:select id="idDoctor" path="idDoctor" multiple="false" class="border border-primary form-control campo">
							<form:option value="0">Seleccione un doctor</form:option>
								<c:forEach var="cte" items="${doctores}">
									<form:option value="${cte.id}"><c:out value="${cte.nombre}- ${cte.paterno}"/></form:option>
								</c:forEach> 
							</form:select>
                            <form:errors path="idDoctor" />
                            
                            
                            
                            <form:errors path="idDoctor" />
                        </div>
                        <div>
                            <form:label path="fecha">Fecha</form:label>
                            <form:input type="text" id="fecha" path="fecha"/>
                            <form:errors path="fecha" />
                        </div>
                        <div>
                            <form:label path="hora">Hora</form:label>
                            <form:input type="text" id="hora" path="hora"/>
                            <form:errors path="hora" />
                        </div>
                        <div>
                            <form:label path="paciente">Paciente</form:label>
                            <form:input type="text" id="paciente" path="paciente"/>
                            <form:errors path="paciente" />
                        </div>
                        
                    </div>
                    <div>
                        <div>
                            <input type="submit" value="Grabar cita">
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div>${error}</div>
    <div><a href="/">Main</a></div>
</body>
</html>