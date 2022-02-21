<%@page import="in.co.rays.project_3.controller.ChangePasswordCtl"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChangePassword Page</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">
</head>
<body>
<%@ include file="Header.jsp" %>
	<div>


<br>
<br><br>

		<main>
		<form action="<%=ORSView.CHANGE_PASSWORD_CTL%>" method="post">
		
		

			<div class="row log1">
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card rounded-lg border-secondary shadow">
						<div class="card-body">
						
						

							<h3 class="text-center text-primary">
							 Change Password
							</h3>
							<!--Body-->
							<div>
							
							<br>

								<jsp:useBean id="dto" class="in.co.rays.project_3.dto.UserDTO"
									scope="request"></jsp:useBean>
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
								<input type="hidden" name="id" value="<%=dto.getId()%>">
								<input type="hidden" name="createdBy"
									value="<%=dto.getCreatedby()%>"> <input type="hidden"
									name="modifiedBy" value="<%=dto.getModifiedby()%>"> <input
									type="hidden" name="createdDatetime"
									value="<%=DataUtility.getTimestamp(dto.getCreateddatetime())%>">
								<input type="hidden" name="modifiedDatetime"
									value="<%=DataUtility.getTimestamp(dto.getModifieddatetime())%>">
							</div>
							
							
							<div class="md-form">
								
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Old Password</b></label><span style="color:red;">*</span> &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-key grey-text" style="font-size: 1rem;"></i> </div>
        </div>
		<input class="form-control" type="password" name="oldpassword" placeholder="Enter password" 
		value=<%=DataUtility.getString(request.getParameter("oldpassword") == null ? "": DataUtility.getString(request.getParameter("oldpassword")))%>>
		 </div>
    </div>	
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; 				
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("oldpassword", request)%></font></br>												
								 
                                 
     
     <div class="col-sm-12">
      <div class="input-group">
      <label><b>New Password</b></label><span style="color:red;">*</span>  &nbsp;&nbsp;&nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-lock grey-text" style="font-size: 1rem;"></i> </div>
        </div>
		<input class="form-control" type="password" name="newpassword" placeholder="Enter password" 
	value=<%=DataUtility.getString(request.getParameter("newpassword") == null ? ""
							: DataUtility.getString(request.getParameter("newpassword")))%>>
		 </div>
    </div>
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; 
     <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("newpassword", request)%></font></br>
                                
    
     <div class="col-sm-12">
      <div class="input-group">
       <label ><b>Confirm <br>
       Password</b></label><span style="color:red;">*</span>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-lock grey-text" style="font-size: 1rem;"></i> </div>
        </div>
		<input class="form-control" type="password" name="confirmpassword" placeholder="Enter password" value=<%=DataUtility.getString(request.getParameter("confirmpassword") == null ? ""
							: DataUtility.getString(request.getParameter("confirmpassword")))%>>
		 </div>
    </div>	                            
   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; 
    <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("confirmpassword", request)%></font></br>                             
                                 
							</div>
							</br>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=ChangePasswordCtl.OP_SAVE%>">
									<input type="submit" name="operation"
									class="btn btn-warning btn-md" style="font-size: 17px"
									value="<%=ChangePasswordCtl.OP_CHANGE_MY_PROFILE%>">
							</div>
                         
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
				</div>
				
				<br><br><br><br><br><br>
				
		</form>
		</main>


	</div>
	

<%@ include file="Footer.jsp" %>
</body>
</html>