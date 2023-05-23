<?php 

require_once '../conn.php';

$valoryago = filter_input(INPUT_POST, 'valoryago');
$anoyago = filter_input(INPUT_POST, 'anoyago');

$stmt = $conn -> prepare("INSERT INTO processadoryago (valoryago, anoyago) VALUES(:VALOR, :ANO)");

$stmt -> bindValue(':VALOR', $valoryago);
$stmt -> bindValue(':ANO', $anoyago);

$stmt -> execute();

header("Location: index_processador.php");