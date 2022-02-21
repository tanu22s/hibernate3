<%@page import="in.co.rays.project_3.controller.ForgetPasswordCtl"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@page import="in.co.rays.project_3.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForgetPassword pages</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">
</head>
<body>
<%@ include file="Header.jsp" %>
	<div>
	
	
	<br>
	<br>
	
		<main>
		<form action="<%=ORSView.FORGET_PASSWORD_CTL%>" method="post">
			<div class="row pt-5">
				<!-- Grid column -->
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div class="card shadow rounded-lg border-secondary">
						<div class="card-body">
							<h3 class="text-center default-text text-primary">Forget Your Password?</h3>
							<p class="text-center default-text text-secondary"> Submit your Email Address and we will Send You password !!</p>
							<H6 align="center">
									<%
										if (!ServletUtility.getSuccessMessage(request).equals("")) {
									%>
									<div class="alert alert-success alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
										<%=ServletUtility.getSuccessMessage(request)%>
									</div>
									<%
										}
									%>
								</H6>
								<H6 align="center">
									<%
										if (!ServletUtility.getErrorMessage(request).equals("")) {
									%>
									<div class="alert alert-danger alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
											<%=ServletUtility.getErrorMessage(request)%>
									</div>
									<%
										}
									%>
								</H6>
							<!--Body-->
							<div>
								<jsp:useBean id="dto" class="in.co.rays.project_3.dto.UserDTO"
									scope="request"></jsp:useBean>
								<input type="hidden" name="id" value="<%=dto.getId()%>">
								<input type="hidden" name="createdBy"
									value="<%=dto.getCreatedby()%>"> <input type="hidden"
									name="modifiedBy" value="<%=dto.getModifiedby()%>"><input
									type="hidden" name="createdDatetime"
									value="<%=DataUtility.getTimestamp(dto.getCreateddatetime())%>">
								<input type="hidden" name="modifiedDatetime"
									value="<%=DataUtility.getTimestamp(dto.getModifieddatetime())%>">
							</div>
							<div class="md-form">
							
		<div class="col-sm-12">
      <div class="input-group">
        <div class="input-group-prepend">
        <label><b>Email Id</b></label>
        <span style="color:red;">*</span> &nbsp; &nbsp;
          <div class="input-group-text"><i class="fa fa-envelope grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" class="form-control" name="login" id="defaultForm-pass" placeholder="Enter email" value="<%=DataUtility.getStringData(dto.getLoginid())%>">
      </div>
    </div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<font color="red" class="pl-sm-5"><%=ServletUtility.getErrorMessage("login", request)%></font></br>						
							 
								
							<div class="text-center">
								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size:16px"
									value="<%=ForgetPasswordCtl.OP_GO%>" >
									
									
				<br>
				<br>
				
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
				</div>
				
				
				
		</form>
		</main>
	</div>
</body>
<%@include file="Footer.jsp"%>


</body>
</html>