<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      <!--  This is for showing icon in title bar. -->  
      <link rel="stylesheet" href="css/BackGround.css">
<title>WelCome to ORS</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">
<style type="text/css">
.bb{
   
 background-image: url("./image/fea.png"); 
 background-size:700px;
 background-repeat: no-repeat;
 background-position:left; 
 background-color:#f7f7f7;
 
 
 }


</style>
</head>
<body class = "bb"> 
<%@include file="Header.jsp" %>

	           <br><br><br><br><br><br><br>
	           
			 <h1 align="center" style="margin-top:3%; margin-left:3%;" >
            <font size="10px" color=darkpink style="font-size: 85px; ">Welcome to ORS</font>
            </h1>
            

<%@include file="Footer.jsp" %>
</body>
</html>