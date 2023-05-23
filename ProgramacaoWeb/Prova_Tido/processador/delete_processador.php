<?php 

require_once '../conn.php';

$idyago = filter_input(INPUT_GET, 'idyago');

if($idyago){
  $stmt = $conn -> prepare("DELETE FROM processadoryago WHERE idyago = :ID");

  $stmt -> bindValue(':ID', $idyago);

  $stmt -> execute();

  header("Location: index_processador.php");
}