<!DOCTYPE html>
<html>
<head>
	<title>Questão 1</title>
</head>
<body>

<h2>Array antes da exclusão</h2>

<?php

	$numeros = array(1, 2, 3, 4, 5);
	foreach ($numeros as $b) {
?>
		<p>
			Indice:

			<?php 
				echo $b.'&nbsp &nbsp'; 
		 	?>

		 	Valor: <?php echo $b; }?>
		 </p>

		<h2>Array depois da exclusão</h2>
		<p>
	<?php
		unset($numeros[2]); 
		foreach ($numeros as $key => $value) {

	?>
		Indice: <?php echo $key.'&nbsp &nbsp'; ?>
		Valor: <?php echo $value.'<br>' ?>
	<?php 
		}
	?>
</p>

</body>
</html>

