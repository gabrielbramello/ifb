<form action="3.php">
    <?php 
    $nome = isset($_GET['nome'])?
        $_GET['nome'] :'';   
    if(
        isset($_GET['nome'])
        and
        (strlen($nome)<10)
    ){
        echo "erro!";      
    }
    ?>
    Digite seu nome:
    <input type="text" name="nome" value="<?=$nome?>"><br>
    <input type="submit">
</form>