<?php

require_once '../conn.php';

$stmt = $conn -> prepare("SELECT * FROM processadoryago");
$stmt -> execute();
$list = $stmt -> fetchAll(PDO::FETCH_ASSOC);

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lista</title>
  <style>
    .content {
                    margin-left: 200px;
                    padding: 20px;
                }
    .data{
      margin-left: 450px;
      margin-right: 600px;
      }
  </style>
</head>
<body>
  <div class="data">
  <table class="content table" border="1">
    <tr>
      <th>ID</th>
      <th>VALOR</th>
      <th>ANO</th>
    </tr>
    <?php foreach ($list as $processadoryago): ?>
      <tr>
        <td><?= $processadoryago['idyago']; ?></td>
        <td><?= $processadoryago['valoryago']; ?></td>
        <td><?= $processadoryago['anoyago']; ?></td>
        <td>
          <a href="update_processador.php?idyago=<?= $processadoryago['idyago']; ?>">Editar</a>
          <a href="delete_processador.php?idyago=<?= $processadoryago['idyago']; ?>">Excluir</a>
        </td>
      </tr>
      
      <?php endforeach; ?>
  </table>
  </div>
</body>
</html>