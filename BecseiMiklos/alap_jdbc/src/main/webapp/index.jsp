<!DOCTYPE html>
<html>
<head>
<title>Fantastic Application</title>
</head>

<body>
	<h2>Create new participant</h2>

	<form action="new" method="POST">

		<div>
			<label for="name">Participant Name:</label> 
			<input type="text" id="name" name="name" placeholder="Enter new name...">
		</div>

		<div>
			<label for="email">Participant Email:</label> 
			<input type="text" id="email" name="email" placeholder="Enter new mail...">
		</div>

		<button type="submit">Create</button>
		
	</form>
</body>
</html>
