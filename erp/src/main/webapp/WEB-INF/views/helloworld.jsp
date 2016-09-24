<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Hello World</h2>
		<h2>
			${message} ${name}
		</h2>
	</center>
	
<div class="col-md-12">
<h5>This is test project for bootstarp</h5>
</div>
<div class="row">
<div class="col-md-4">
<button type="button" class="btn btn-danger">Danger</button>
</div>
</div>	
	
</body>
</html>


<form:form cssClass="form-bordered" id="lobForm" modelAttribute="lob"
		action="${addLobMasterURL}" method="post">

		<div class="row form-group">
			<div class="col-md-4">
			</div>
			<div class="col-md-8">
			</div>
		</div>
		<div class="row form-group">
			<div class="col-md-4">
				<label path="shortName">Code<span
						class="text-danger">*</span>
				</label>
			</div>
			<div class="col-md-8">
				<form:input path="shortName" maxlength="5" />
			</div>
		</div>

		<div class="row form-group">
			<div class="col-md-4">
				<label path="inTime">Select In Time</label>
			</div>
			<input name="inTimeHr" id="inTimeHr" type="hidden" value="<fmt:formatDate  pattern='HH' value='${lob.inTime}' />"/>
			<input name="inTimeMin" id="inTimeMin" type="hidden" value="<fmt:formatDate  pattern='mm' value='${lob.inTime}'/>"/>
			<div class="col-md-8">
				<div class="input-group">
				<input name="inTime" id="inTime" data-date-format="hh:mm" placeholder="hh:mm" value="<fmt:formatDate  pattern='HH:mm' value='${lob.inTime}' />"/>
				</div>
			</div>
		</div>

	<div class="row form-group">
		<div class="col-md-4">
			<label path="graceTime">Late Mark Time(In Min)</label>
		</div>
		<div class="col-md-8">
			<div class="input-group bootstrap-timepicker">
				<form:input path="graceTime" class="form-control " id="spinnerGrace" style="border: 1px solid #DDD;
									margin-bottom: 0px;"/>
				<!--                  <span class="input-group-btn"> -->
				<!--                      <a href="javascript:void(0)" class="btn btn-primary"><i class="fa fa-clock-o"></i></a> -->
				<!--                  </span> -->
			</div>
		</div>
	</div>
		<div class="row form-group">
			<div class="col-md-4">
		
				<label path="workingHours">Total Working Hours</label>
			</div>
			<div class="col-md-4">
			
				<div class="input-group bootstrap-timepicker">
				<input name="workingHours" id="workingHours" data-date-format="HH:mm"
						 placeholder="Select Total Working Hours" value="<fmt:formatDate  pattern='HH:mm' value='${lob.workingHours}' />" >
				</div>
			</div>
	</div>	
			<div class="row form-group">
				<div class="col-md-4">
					<label>Select Weekly Working Saturdays</label>
				</div>
				<div class="col-md-8">
					<div class="col-md-2">
						<form:checkbox path="saturday1" />
						First
					</div>
					<div class="col-md-2">
						<form:checkbox path="saturday2" />
						Second
					</div>
					<div class="col-md-2">
						<form:checkbox path="saturday3" />
						Third
					</div>
					<div class="col-md-2">
						<form:checkbox path="saturday4" />
						Fourth
					</div>
					<div class="col-md-2">
						<form:checkbox path="saturday5" />
						Fifth
					</div>
				</div>
			</div>
	

			<div class="row form-group">
				<div class="col-md-4">
					<label path="consultant">Is this a Consultant Company?</label>
				</div>
				<div class="col-md-8">
					<form:checkbox path="consultant" />
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-4">
					<label path="captureFromInternet">Capture Attendance from Internet?</label>
				</div>
				<div class="col-md-8">
					<form:checkbox path="captureFromInternet" />
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-4">
					<label >Capture Attendance?</label>
				</div>
				<div class="col-md-8">
					<form:checkbox path="captureAttendance" />
				</div>
			</div>

			<div class="row form-group">
				<div class="col-md-12">
		
					<input type="submit" class="btn btn-md btn-primary"
						id="submitdetails" value="Save" />
				</div>
			</div>
	</form:form>