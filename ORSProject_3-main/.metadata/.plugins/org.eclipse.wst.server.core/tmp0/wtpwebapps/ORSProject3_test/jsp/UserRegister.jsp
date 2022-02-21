<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>ORS </title>
  <title>ORS</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

</head>
<body>

    <nav class="navbar navbar-expand navbar-dark flex-column flex-md-row bd-navbar" style="height:50px ; background-color:#007bff;  ">
     <img src="../
     resources/IMG/logoRays.png" class = "navbar-brand" height="40" width="80" style="margin-top: 0.2%" align="left" > 
     <div class = "navbar-header">
     <a class="navbar-brand"><strong> ORS </strong></a>
     </div>
     </nav>

        <div class = "container-fluid   m-5  pt-4"  >


        	
        
        	<div class = "container border col-sm-6  " >
        		<h2 class = "border-bottom text-center text-primary"> User Registration</h2>

        		<form action="/ORSProject3_test/CTL"  method="post">
        		
                    <div class="form-group form-row">
                    <label for="firstName" class="col-sm-2 col-form-label col-form-label-sm col">
                        FirstName <i class="fas fa-asterisk" style="color:red"></i>
                    </label>
                    <div class="col">
                        <input class="form-control form-control-sm" type="text" id="fname" name="firstName" placeholder="First Name" required >
                    </div>
                </div>
                <div class="form-group form-row">
                    <label for="lastName" class="col-sm-2 col-form-label col-form-label-sm col">
                        Last Name <i class="fas fa-asterisk" style="color:red"></i>
                    </label>
                    <div class="col">
                        <input class="form-control form-control-sm" type="text" id="lname" name="lastName" placeholder="Last Name" required >
                    </div>
                </div>

                <div class="form-group form-row">
                    <label for="login" class="col-sm-2 col-form-label col-form-label-sm col">
                        Login <i class="fas fa-asterisk" style="color:red"></i>
                    </label>
                    <div class="col">
                        <input class="form-control form-control-sm" type="email" id="login" name="login" placeholder="Login" required >
                    </div>
                </div>
                <div class="form-group form-row">
                    <label for="pwd" class="col-sm-2 col-form-label col-form-label-sm col">
                        Password <i class="fas fa-asterisk" style="color:red"></i>
                    </label>
                    <div class="col">
                        <input class="form-control form-control-sm" type="password" id="password" name="pwd" placeholder="Password" required >
                    </div>
                </div>
                 <div class="form-group form-row">
                    <label for="pwd" class="col-sm-2 col-form-label col-form-label-sm col">
                        MobileNo<i class="fas fa-asterisk" style="color:red"></i>
                    </label>
                    <div class="col">
                        <input class="form-control form-control-sm" type="text" id="mobileNo" name="Mobileno" placeholder="mobile no" required >
                    </div>
                </div>
               

               
                
                <div class="form-group form-row justify-content-end">
                    <button type="submit" class="btn btn-outline-primary btn-sm">
                        <i class="fa fa-user-plus"></i> Sign Up
                    </button>
                </div>


        		</form>
        	</div>
        </div>



<p class="d-flex justify-content-center">© 2022, Rays Technologies, SunilOS Infotech Pvt Ltd. </p>
</body>
</html>