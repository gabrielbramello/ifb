<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <?php
        $cidades = array('Rio de Janeiro' => 6453682, 'Salvador' => 2902927, 'Fortaleza' => 2571896, 'Manaus' => 2020301, 'Curitiba' => 1864416,
         'Brasília' => 2852372, 'Porto Alegre' => 1472482, 'Belo Horizonte' => 2491109, 'Recife' => 1608488, 'São Paulo' => 11895893
         );
     ?>
    <table>
        <?php
            foreach ($cidades as $key => $value) {
         ?>
                <tr>
                    <?php
                        if ($value>2500000) {
                     ?>
                            <td><strong><?php echo $key; ?></strong></td>
                    <?php
                        }else{
                     ?>
                             <td><?php echo $key; ?></td>
                    <?php
                        }
                     ?>
                    <td><?php echo $value; ?></td>
                </tr>
        <?php
            }
         ?>
    </table>
</body>
</html>

