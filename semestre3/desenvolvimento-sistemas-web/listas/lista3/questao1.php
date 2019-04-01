<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
    <?php
        $hamb = 9.95;
        $milkshake =  8;
        $refri = 4.5;

        $total = ($hamb + $milkshake + $refri)*1.10;

        echo "O valor total do pedido é ", number_format($total, 2)  ;
    ?>
    </body>
</html>
