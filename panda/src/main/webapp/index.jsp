<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body align="center">
<h1>Send details of favourite person</h1>
<form action="sms" method="post">

FirstName<input type="text" name="fname"/>
<br>
LastName<input type="text" name="lname"/>
<br>
<div>Gender
male<input type="radio" value="male" name="gender"/>
female<input type="radio" value="female" name="gender"/>
others<input type="radio" value="others" name="gender"/>
</div>
Reason <textarea rows="5" cols="25" name="reason"></textarea><br>
Address<textarea rows="5" cols="25" name="address"></textarea>
<br>
<input type="submit" name="send">
<br>




</form>
</body>
</html>