<!DOCTYPE html>


<html lang="pt-br">
<head>
	<meta charset = "UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name ="viewport" content="width, initial-scale=1.0">
	<title>CRUD</title>
</head>
<body>
	<form action="insert.php" method="post">
		<div>
			<label for="name">Digite o seu nome:</label>
			<input type="text" name="name" id="name">
		</div>	
		<div>
			<label for="email">Digite o seu email:</label>
			<input type="email" name="email" id="email">
		</div>
		<div>
			<label for="password">Digite sua senha:</label>
			<input type="password" name="password" id="password">
		</div>	
		<div>
			<input type="submit" value="cadastrar">
		</div>		
	</form>
</body>
</html>