<?php
include_once "../sidebar.php";
?>

<?php

require_once '../conn.php';

$idyago = filter_input(INPUT_GET, 'idyago');

$stmt = $conn -> prepare("SELECT * FROM carroyago WHERE idyago = :ID");

$stmt -> bindValue(':ID', $idyago);

$stmt -> execute();

$carroyago = $stmt -> fetch(PDO::FETCH_ASSOC);

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Editar</title>
</head>
<body>
  <form action="update-action_carro.php" method="post">
    <input type="hydden" name="idyago" value="<?= $carroyago['idyago']; ?>" readonly>
    <div>
      <label for="valoryago">Digite o novo valor</label>
      <input type="text" name="valoryago" value="<?= $carroyago['valoryago']; ?>">
    </div>
    <div>
      <label for="valoryago">Digite o novo ano</label>
      <input type="text" name="anoyago" alue="<?= $carroyago['anoyago']; ?>">
    </div>
    <div>
      <button type="submit" value="atualizar">Atualizar</button>
    </div>
  </form>
</body>
</html>