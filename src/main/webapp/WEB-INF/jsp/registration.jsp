<%--
  Created by IntelliJ IDEA.
  User: Mohammad Vasim
  Date: 11/28/2021
  Time: 1:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>

        <form:form modelAttribute="registrationModel">
            <h2>Registered User: ${registrationModel.name}</h2>
            <h2>Enter Your Name</h2>
            <form:input path="name"/>
            <button type="submit">Registration</button>

        </form:form>
</body>
</html>
