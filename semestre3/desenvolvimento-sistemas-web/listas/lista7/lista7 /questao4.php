<!DOCTYPE html>
<html>
<head>
	<title>Questão 4</title>
</head>
<body>

	<?php

		$filmes = array(
    		array(
        		"titulo" => "Janela Indiscreta",
        		"diretor" => "Alfred Hitchcock",
        		"ano" => 1954
    		),
    		array(
        		"titulo" => "2001: Uma Odisseia no Espaço",
        		"diretor" => "Stanley Kubrick",
        		"ano" => 1968
    		),
    		array(
        		"titulo" => "Os Infiltrados",
        		"diretor" => "Martin Scorsese",
        		"ano" => 1006
    		)
		);

		foreach ($filmes as $key => $arrayInterno) {
			foreach ($arrayInterno as $keyInterno => $value) {
				if ($keyInterno=="titulo") {
		?>
					<h2><?php echo $value; ?></h2>
				<?php
                }elseif ($keyInterno=="diretor") {
                ?>
                <ul>
                    <li>Diretor: <?php echo $value ?></li>
	            <?php
                }else{
                ?>
                    <li>Ano: <?php echo $value?></li>
                    </ul>
                <?php }
                }
            }
        ?>

</body>
</html>

