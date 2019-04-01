<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Questão 2</title>
        <style media="screen">
            table {
                border-collapse: collapse;
            }
            table tr td {
                text-align: center;
                 border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <?php
            $hamb = 9.95; 
            $milkshake =  8;
            $refri = 4.5;
            $total = ($hamb + $milkshake + $refri)
        ?>
        <table>
            <tr>
                <td>Item</td>
                <td>Quantidade</td>
                <td>Preço</td>
                <td>Total</td>
            </tr>
            <tr>
                <td>Hamburger</td>
                <td>2x</td>
                <td><?php echo $hamb;?></td>
                <td><?php echo $hamb*2; ?></td>
            </tr>
            <tr>
                <td>Milk-Shake</td>
                <td>1x</td>
                <td><?php echo $milkshake; ?></td>
                <td><?php echo $milkshake; ?></td>
            </tr>
            <tr>
                <td>Refrigerante</td>
                <td>1x</td>
                <td><?php echo $refri; ?></td>
                <td><?php echo $refri; ?></td>
            </tr>
            <tr>
                <td>Total sem comissão</td>
                <td colspan="3"><?php echo number_format($total, 2); ?></td>
            </tr>
            <tr>
                <td>Total com comissão</td>
                <td colspan="3"><?php echo number_format($total*1.1, 2) ?></td>
            </tr>
        </table>
    </body>
</html>
