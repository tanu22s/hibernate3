<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.controller.CollegeCtl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Page</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">
</head>
<body>
<%@ include file="Header.jsp" %>

<div>
	
	<br>
	

		<main>
		<form action="<%=ORSView.COLLEGE_CTL%>" method="post">

			<div class="row pt-3 pb-4">
				<!-- Grid column -->
				<jsp:useBean id="dto" class="in.co.rays.project_3.dto.CollegeDTO"
					scope="request"></jsp:useBean>
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card rounded-lg border-secondary shadow">
						<div class="card-body">
							<%
								long id = DataUtility.getLong(request.getParameter("id"));
								if (id > 0) {
							%>
							<h3 class="text-center text-primary">Update College</h3>
							<%
								} else {
							%>
							<h3 class="text-center text-primary">Add College</h3>
							<%
								}
							%>
							<!--Body-->
							<div>

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
      <label><b>Name</b></label> 
	  <span style="color: red;">*</span> &nbsp;&nbsp; &nbsp;&nbsp; 
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-university grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" name="cname"  class="form-control"
									id="defaultForm-email" 
									placeholder="Enter Name"
									value="<%=DataUtility.getStringData(dto.getName())%>">
      </div>
    </div>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("cname", request)%></font></br>			
		
								

								
	<div class="col-sm-12">
      <div class="input-group">
      <label></label><b>Address</b>
	  <span style="color: red;">*</span>  &nbsp;&nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-address-book grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" name="caddress" class="form-control"
									placeholder="Enter Address"
									value="<%=DataUtility.getStringData(dto.getAddress())%>">
      </div>
    </div>	
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("caddress", request)%></font></br>
									
									
								
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>State</b></label>
	  <span style="color: red;">*</span> &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-address-card grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" name="cstate" class="form-control" placeholder="Enter State" value="<%=DataUtility.getStringData(dto.getState())%>">
      </div>
    </div>	
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("cstate", request)%></font></br>
									

								
		<div class="col-sm-12">
      <div class="input-group">
      <label ><b>City</b></label>
	<span style="color: red;">*</span> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-address-card grey-text" style="font-size: 1rem;"></i> </div>
        </div>
       <input type="text" name="ccity" class="form-control" placeholder="Enter City" value="<%=DataUtility.getStringData(dto.getCity())%>">
      </div>
    </div>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("ccity", request)%></font><br>
									

								
	<div class="col-sm-12">
      <div class="input-group">
        <div class="input-group-prepend">
        <label><b>Mobile</b></label>
		<span style="color: red;">*</span>  &nbsp; &nbsp;&nbsp; 
          <div class="input-group-text"><i class="fa fa-phone grey-text" style="font-size: 1rem;"></i> </div>
        </div>
       <input type="text"  class="form-control"
									name="cphone" placeholder="Enter MobileNo" maxlength="10"
									value="<%=DataUtility.getStringData(dto.getPhoneno())%>">
      </div>
    </div>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("cphone", request)%></font></br>
    
								
							</div>
							</br>
							<%
								if (id > 0) {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=CollegeCtl.OP_UPDATE%>"> <input type="submit"
									name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=CollegeCtl.OP_CANCEL%>">
							</div>
							<%
								} else {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=CollegeCtl.OP_SAVE%>"> <input type="submit"
									name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=CollegeCtl.OP_RESET%>">
							</div>
							<%
								}
							%>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
			</div>
		</form>
		</main>


	</div>


<%@ include file="Footer.jsp" %>
</body>
</html>