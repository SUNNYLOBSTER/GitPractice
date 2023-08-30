<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job 등록 </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="./jobInsert.do" method="post">
			 <div class="form-group">
			      <label for="id">아이디:</label>
			      <input type="text" class="form-control" id="id" name="id">
			 </div>
			 <div class="form-group">
			      <label for="title">업무명:</label>
			      <input type="text" class="form-control" id="title" name="title">
			 </div>
			 <div class="form-group">
			      <label for="min">최소급여:</label>
			      <input type="text" class="form-control" id="min" name="min">
			 </div>
			 <div class="form-group">
			      <label for="max">최대급여:</label>
			      <input type="text" class="form-control" id="max" name="max">
			 </div>
			 <div>
			 	<input class="btn btn-success btn-block" type="submit" value="등록">
			 </div>
		</form>
	</div>
</body>
</html>