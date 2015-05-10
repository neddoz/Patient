<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>

<div class="msg">${msg}</div>
<form action="<c:url value='/create'/>" method="post">

    <label for="fname">Patient First name</label>&nbsp;<input type="text" placeholder="first name" name="fname"id="fname" required></br></br>
<label for="fname">Patient Second name</label>&nbsp;<input type="text" placeholder="last name" name="lname" required></br></br>
<label for="fname">Patient Date of Birth</label>&nbsp; <input type="date" placeholder="Select" name="dob" required></br></br>
    <button> Create</button>

</form>
<p>List of Patients</p>
<c:if test="${!empty listPatient}">
    <table class="tg">
        <tr>
            <th width="80">Patient ID</th>
            <th width="150">Patient Name</th>
            <th width="150">Date of Birth</th>
            <th width="150">Administer Drug</th>
        </tr>
        <c:forEach items="${listPatient}" var="patient">
            <tr>
                <td>${patient.id}</td>
                <td>${patient.fname} ${patient.lname}</td>
                <td>${patient.dateofbirth}</td>
                <td><a href="<c:url value='/Assigndrug?id=${patient.id}' />" >Administer Drug</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>