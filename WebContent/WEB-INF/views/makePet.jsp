<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Make a pet!</title>
</head>
<body>

	<div>
		<h1>Make a Dog!</h1>
		<form action="/Pets/dog" method="POST">
			Name: <input type="text" name="name"><br><br>
			Breed: <input type="text" name="breed"><br><br>
			Weight (lb): <input type="text" name="weight"><br><br>
			<input type="submit" value="Submit">
		</form>
	</div>
	
	<div>
		<h1>Make a Cat!</h1>
		<form action="/Pets/cat" method="POST">
			Name: <input type="text" name="name"><br><br>
			Breed: <input type="text" name="breed"><br><br>
			Weight (lb): <input type="text" name="weight"><br><br>
			<input type="submit" value="Submit">
		</form>
	</div>

</body>
</html>