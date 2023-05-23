<?php 

$host = "localhost";
$user = "root";
$password = "";
$db = "dateyago";

try{
  $conn = new PDO("mysql:host=". $host . "; dbname=" . $db, $user, $password);
}catch(Exception $err){
 // echo "Erro na conexão: ". $err;
    echo "Servidor instável, retorne em algunns minutos";
}