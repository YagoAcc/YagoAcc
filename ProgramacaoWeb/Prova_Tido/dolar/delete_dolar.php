<?php 

require_once '../conn.php';

$idyago = filter_input(INPUT_GET, 'idyago');

if($idyago){
  $stmt = $conn -> prepare("DELETE FROM dolaryago WHERE idyago = :ID");

  $stmt -> bindValue(':ID', $idyago);

  $stmt -> execute();

  header("Location: index_dolar.php");
}