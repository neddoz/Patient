<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<body>
<div>
    <p>Name: ${patient.fname} ${patient.lname} </p>
    <p>Date Of Birth: ${patient.dateofbirth} </p>
    <p>Administer Drug</p>
    <form action="<c:url value='/insertdrug'/>" method="post">
        <input type="hidden" name="patient_id" value="${patient.id}">
        <label for="dname">Drug Name:</label>
        <input type="text" name="dname" id="dname" required>
        <button>Administer</button>
    </form>
</div>
</body>
</html>