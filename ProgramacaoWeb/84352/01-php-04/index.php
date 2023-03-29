<?php

// comentário de 1 linha

/*

O(A) estudante Dandara da Silva 
n1 = 7
n2 = 9
n3 = 6

A média = (n1 + n2 + n3) / 3

Se a média >= 7
    aprovada
Se a média >= 4
    conselho
Senão
    reprovada

*/

$student = "Dandara da Silva";
$n1 = 7;
$n2 = 9;
$n3 = 6;

$average = ($n1 + $n2 + $n3) / 3;

if($average >= 7){
    echo "A aluna $student ficou com a media = $average e foi aprovada";
}else if($average >= 4){
    echo "A aluna $student ficou com a media = $average e foi para o conselho";
}else {
    echo "A aluna $student ficou com a media = $average e foi reprovada";
}


?>