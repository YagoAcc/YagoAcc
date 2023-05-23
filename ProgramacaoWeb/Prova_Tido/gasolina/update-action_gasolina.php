<?php 

require_once '../conn.php';

$idyago = filter_input(INPUT_POST, 'idyago');
$valoryago = filter_input(INPUT_POST, 'valoryago');
$anoyago = filter_input(INPUT_POST, 'anoyago');

$stmt = $conn -> prepare("UPDATE gasolinayago SET valoryago = :VALOR, anoyago = :ANO WHERE idyago = :ID");

$stmt -> bindValue(':ID', $idyago);
$stmt -> bindValue(':VALOR', $valoryago);
$stmt -> bindValue(':ANO', $anoyago);

$stmt -> execute();

header("Location: index_gasolina.php");