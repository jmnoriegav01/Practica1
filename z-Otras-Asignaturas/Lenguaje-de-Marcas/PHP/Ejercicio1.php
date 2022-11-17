<?php
    $litros_x_pintura = 0.1;
    $alto_pared = 10;
    $ancho_pared = 4;
    $precio_lata = 42;
    $total1 = ($alto_pared * $ancho_pared) * $litros_x_pintura;
    $total2 = $total1 ^ $precio_lata;

    echo "El pintor debe gastar " . $total2 . " € por pintar la pared";
?>

