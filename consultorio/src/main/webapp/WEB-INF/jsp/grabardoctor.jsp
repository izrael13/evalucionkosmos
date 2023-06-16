<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Doctor</title>
</head>
<body>
<div>
        <h2>Nuevo doctor</h2>
        <div>
            <div>
                <form:form action="/adddoctor" modelAttribute="doctor" method="post">
                    <div>
                        <div>
                            <form:label path="nombre">Nombre</form:label>
                            <form:input type="text" id="nombre" path="nombre"/>
                            <form:errors path="nombre" />
                        </div>
                        <div>
                            <form:label path="paterno">Apellido parterno</form:label>
                            <form:input type="text" id="paterno" path="paterno"/>
                            <form:errors path="paterno" />
                        </div>
                        <div>
                            <form:label path="materno">Apellido materno</form:label>
                            <form:input type="text" id="paterno" path="materno"/>
                            <form:errors path="materno" />
                        </div>
                        <div>
                            <form:label path="especialidad">Especialidad</form:label>
                            <form:input type="text" id="especialidad" path="especialidad"/>
                            <form:errors path="especialidad" />
                        </div>
                    </div>
                    <div>
                        <div>
                            <input type="submit" value="Grabar doctor">
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div><a href="/">Main</a></div>
</body>
</html>