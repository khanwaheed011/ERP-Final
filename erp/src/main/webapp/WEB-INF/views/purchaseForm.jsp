<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Purchase Order</title>
</head>

<c:url var="addPurchase" value="/addPurchase" ></c:url>

<form:form cssClass="form-bordered" id="purchaseForm" modelAttribute="purchase"
		action="${addPurchase}" method="post">

		<div class="row form-group">
			<div class="col-md-4">
			</div>
			<div class="col-md-8">
			</div>
		</div>

		<div class="row form-group">
			<div class="col-md-4">
				<label >Select In Time</label>
			</div>
			<input name="inTimeHr" id="inTimeHr" type="hidden" />
			<input name="inTimeMin" id="inTimeMin" type="hidden" />
			<div class="col-md-8">
				<div class="input-group">
				<input name="inTime" id="inTime" data-date-format="hh:mm" placeholder="hh:mm" />
				</div>
			</div>
		</div>

	<div class="row form-group">
		<div class="col-md-4">
			<label>Total Working Hours</label>
		</div>
		<div class="col-md-4">
			<div class="input-group bootstrap-timepicker">
				<input name="workingHours" id="workingHours"
					data-date-format="HH:mm" placeholder="Select Total Working Hours">
			</div>
		</div>
	</div>


	<div class="row form-group">
				<div class="col-md-12">
		
					<input type="submit" class="btn btn-md btn-primary"
						id="submitdetails" value="Save" />
				</div>
			</div>
	</form:form>