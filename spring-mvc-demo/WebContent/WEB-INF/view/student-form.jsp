
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<HTML>
<HEAD>
<TITLE>Student Registration Form</TITLE>

</HEAD>
<BODY>
<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="fname" />
<br>
Last Name: <form:input path="lname" />



<input type="submit" value="Submit" />
</form:form>






</BODY>



</HTML> 