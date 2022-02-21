<%@page import="in.co.rays.project_3.controller.TimeTableCtl"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.LinkedHashMap"%>
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
<title>TimeTable Page</title>
<link rel="shortcut icon" href="<%=ORSView.APP_CONTEXT%>/image/TitleIcon.png" type="image/x-icon">

</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="CalendarTT.jsp" %>


	<div>
		<main>
		<form action="<%=ORSView.TIMETABLE_CTL%>" method="post">
			<div class="row pt-3 pb-3">
				<jsp:useBean id="dto" class="in.co.rays.project_3.dto.TimeTableDTO"
					scope="request"></jsp:useBean>
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card rounded-lg border-secondary shadow">
						<div class="card-body">
							<%
								long id = DataUtility.getLong(request.getParameter("id"));
								if (id > 0) {
							%>
							<h3 class="text-center text-primary">Update Time Table</h3>
							<%
								} else {
							%>
							<h3 class="text-center text-primary">Add Time Table</h3>
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
								<%
									List l = (List) request.getAttribute("courseList");
									List li = (List) request.getAttribute("subjectList");
								%>
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
      <label><b>Course</b></label><span style="color: red;">*</span>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-envelope grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <%=HTMLUtility.getList("courseid", String.valueOf(dto.getCourseid()), l)%>
      </div></div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("coursename", request)%></font></br>
	

<div class="col-sm-12">
      <div class="input-group">
      <label><b>Subject</b></label><span style="color: red;">*</span>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-book grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <%=HTMLUtility.getList("subjectid", String.valueOf(dto.getSubjectid()), li)%>
      </div></div>
		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("subjectname", request)%></font></br>
			
	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Semester</b></label><span style="color: red;">*</span>&nbsp; &nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-sort grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <%
        LinkedHashMap map = new LinkedHashMap();
        map.put("1st", "1st");
        map.put("2nd", "2nd");
        map.put("3rd", "3rd");
        map.put("4th", "4th");
        map.put("5th", "5th");
        map.put("6th", "6th");
        map.put("7th", "7th");
        map.put("8th", "8th");
        
										String htmlList = HTMLUtility.getList("sem", dto.getSemester(), map);
									%>
									<%=htmlList%>
      </div></div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("sem", request)%></font></br>
	
	
	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Exam Date</b></label><span style="color: red;">*</span>&nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-calendar grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <input type="text" class="form-control"  name="examdate" placeholder="Enter Exam Date" id="datepicker" readonly="readonly"
									value="<%=DataUtility.getDateString(dto.getExamdate())%>">
      </div>
    </div>	
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("examdate", request)%></font></br>
	

	<div class="col-sm-12">
      <div class="input-group">
      <label><b>Exam Time</b></label><span style="color: red;">*</span>&nbsp; &nbsp;
        <div class="input-group-prepend">
          <div class="input-group-text"><i class="fa fa-clock grey-text" style="font-size: 1rem;"></i> </div>
        </div>
        <%
										HashMap map1 = new HashMap();
										map1.put("08:00 AM to 11:00 AM", "08:00 AM to 11:00 AM");
										map1.put("12:00PM to 3:00PM", "12:00PM to 3:00PM");
										map1.put("3:00PM to 6:00PM", "3:00PM to 6:00PM");
										String htmlList1 = HTMLUtility.getList("examtime", dto.getExamtime(), map1);
									%>
									<%=htmlList1%>
      </div></div>
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("examtime", request)%></font></br>
	
							</br>
							
							<%
								if (id>0) {
							%>
							<div class="text-center">
								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=TimeTableCtl.OP_UPDATE%>"> <input
									type="submit" name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=TimeTableCtl.OP_CANCEL%>">
							</div>
							<%
								} else {
							%>
							<div class="text-center">
								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=TimeTableCtl.OP_SAVE%>"> <input type="submit"
									name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=TimeTableCtl.OP_RESET%>">
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