<!DOCTYPE html>
<html>
<head>
	<title>Questão 2</title>
</head>
<body>

	<?php 
		$nomeIdade = array('João' => 41, 'Guilherme' => 39, 'Rodrigo' =>40 );
	 ?>

	 <h2>Ordem ascendente por valor</h2>

	 <?php 
	 	asort($nomeIdade); 
	 	foreach ($nomeIdade as $key => $value) {
	 ?>
	 		<p>
	 			Nome:
	 			<?php 
	 				echo $key.'&nbsp &nbsp';
	 			 ?>

	 			Idade:
	 			<?php 
	 				echo $value;
	 			 ?>
	 		</p>		
	 	<?php } ?>
	 
	 <h2>Ordem ascedente por chave</h2>

	 <?php 
	 	ksort($nomeIdade);
	 	foreach ($nomeIdade as $key => $value) {
	 ?>
	 		<p>
	 			Nome:
	 			<?php 
	 				echo $key.'&nbsp &nbsp';
	 			 ?>

	 			 Idade:
	 			 <?php 
	 			 	echo $value;
	 			  ?>
	 		</p>		
	 <?php } ?>
	  
<h2>Ordem descedente por valor</h2>

	 <?php 
	 	arsort($nomeIdade);
	 	foreach ($nomeIdade as $key => $value) {
	 ?>
	 		<p>
	 			Nome:
	 			<?php 
	 				echo $key.'&nbsp &nbsp';
	 			 ?>

	 			 Idade:
	 			 <?php 
	 			 	echo $value;
	 			  ?>
	 		</p>		
	 <?php } ?>

	 <h2>Ordem descedente por chave</h2>

	 <?php 
	 	krsort($nomeIdade);
	 	foreach ($nomeIdade as $key => $value) {
	 ?>
	 		<p>
	 			Nome:
	 			<?php 
	 				echo $key.'&nbsp &nbsp';
	 			 ?>

	 			 Idade:
	 			 <?php 
	 			 	echo $value;
	 			  ?>
	 		</p>		
	 <?php } ?>
	 

</body>
</html>