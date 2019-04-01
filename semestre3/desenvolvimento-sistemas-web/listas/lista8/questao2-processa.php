<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <?php
        $preco=0;
        echo "<p>Olá $_GET[nome] $_GET[sobrenome]</p> ";
        echo "<p>Você incluiu</p>";
        ?>
        <ul>
            <?php
                foreach ($_GET['item'] as $item) {
                    switch ($item) {
                        case 'guitarra':
                            $preco+=500;
                            echo "<li>Guitarra --- R$500,00</li>";
                            break;
                        case 'baixo':
                            $preco+=450;
                            echo "<li>Baixo --- R$450,00</li>";
                            break;
                        case 'bateria':
                            $preco+=1000;
                            echo "<li>Bateria --- R$1000,00</li>";
                            break;
                        case 'cordas':
                            $preco+=40;
                            echo "<li>Cordas --- R$40,00</li>";
                            break;
                        case 'microfones':
                            $preco+=150;
                            echo "<li>Microfones --- R$150,00</li>";
                            break;
                        case 'piano':
                            $preco+=550;
                            echo "<li>Piano --- R$550,00</li>";
                            break;
                        case 'caixa':
                            $preco+=200;
                            echo "<li>Caixa --- R$200,00</li>";
                            break;
                        case 'pedal':
                            $preco+=300;
                            echo "<li>Pedal --- R$300,00</li>";
                            break;
                    }
                }
                echo "<li>Total: $preco </li>";
         ?>
     </ul>

</body>
</html>
