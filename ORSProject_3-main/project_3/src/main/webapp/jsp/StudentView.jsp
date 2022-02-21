<%@page import="in.co.rays.project_3.controller.StudentCtl"%>
<%@page import="in.co.rays.project_3.util.HTMLUtility"%>
<%@page import="java.util.List"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stuent Page</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="Calendar.jsp" %>

<div>
		<jsp:useBean id="dto" class="in.co.rays.project_3.dto.StudentDTO"
			scope="request"></jsp:useBean>
		<main>
		<form action="<%=ORSView.STUDENT_CTL%>" method="post">

			<div class="row pt-3 pb-3">
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card rounded-lg border-secondary shadow">
						<div class="card-body">
							<%
								long id = DataUtility.getLong(request.getParameter("id"));
								if (id > 0) {
							%>
							<h3 class="text-center default-text text-primary">Update Student</h3>
							<%
								} else {
							%>
							<h3 class="text-center default-text text-primary">Add Student</h3>
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
							<%
								List li = (List) request.getAttribute("collegeList");
							%>

	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>College</b></label><span style="color: red;">*</span> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-building grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <%=HTMLUtility.getList("college", String.valueOf(dto.getCollegeid()), li)%>
      </div></div>	
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <font color="red" class="pl-sm-5">  <%=ServletUtility.getErrorMessage("college", request)%></font></br>								
									
	
		<div class="col-sm-12">
      <div class="input-group">
      <label><b>First Name</b></label><span style="color: red;">*</span> &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-user-alt grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" class="form-control" name="firstname" placeholder="First Name" value="<%=DataUtility.getStringData(dto.getFirstname())%>">
      </div>
    </div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("firstname", request)%></font></br>			
	
	
    <div class="col-sm-12">
      <div class="input-group">
      <label><b>Last Name</b></label><span style="color: red;">*</span>  &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-user-circle grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" class="form-control" name="lastname" placeholder="Last Name" value="<%=DataUtility.getStringData(dto.getLastname())%>">
      </div>
    </div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("lastname", request)%></font></br>		
	
	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Email Id</b></label><span style="color: red;">*</span>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-envelope grey-text" style="font-size: 1rem;"></i> </div>
        </div>
       <input type="text" name="email" class="form-control" placeholder="email Id"
									value="<%=DataUtility.getStringData(dto.getEmailid())%>">
      </div>
    </div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("email", request)%></font></br>
	
	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Mobile No</b></label><span style="color: red;">*</span> &nbsp; &nbsp; &nbsp;  &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-phone-square grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" class="form-control" id="defaultForm-email" maxlength="10" name="mobile" placeholder="mobile No" value="<%=DataUtility.getStringData(dto.getMobileno())%>">
      </div>
    </div>							
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobile", request)%></font></br>
	
	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>DOB</b></label><span style="color: red;">*</span> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-calendar grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" id="datepicker" name="dob" class="form-control" placeholder="Date Of Birth" readonly="readonly" value="<%=DataUtility.getDateString(dto.getDob()) %>">
      </div>
    </div>	
	 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("dob", request)%></font></br>
							
							<br>
							
							<%
									if(id>0) {
								%>
								<div class="text-center">

									<input type="submit" class="btn btn-success" name="operation" 
										value="<%=StudentCtl.OP_UPDATE%>"> 
										<input
										type="submit" class="btn btn-warning" name="operation"
										value="<%=StudentCtl.OP_CANCEL%>">

								</div>
								<%
									} else {
								%>
								<div class="text-center">

									<input type="submit" name="operation"
										class="btn btn-success btn-md" style="font-size: 17px"
										value="<%=StudentCtl.OP_SAVE%>"> &nbsp; <input type="submit"
										name="operation" class="btn btn-warning btn-md"
										style="font-size: 17px" value="<%=StudentCtl.OP_RESET%>">

								</div>
								<%
									}
								%>
							</div>
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