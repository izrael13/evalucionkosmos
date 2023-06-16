<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grabar consultorio</title>
</head>
<body>
      <h2>Nuevo consultorio</h2>
        <div>
            <div>
                <form:form action="/grabarconsultorio" modelAttribute="consultorio" method="post">
                    <div>
                        <div>
                            <form:label path="numero">Numero</form:label>
                            <form:input type="text" id="numero" path="numero"/>
                            <form:errors path="numero" />
                        </div>
                        <div>
                            <form:label path="piso">Piso</form:label>
                            <form:input type="text" id="piso" path="piso"/>
                            <form:errors path="piso" />
                        </div>
                    </div>
                    <div>
                        <div>
                            <input type="submit" value="Grabar consultorio">
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div><a href="/">Main</a></div>
</body>
</html>