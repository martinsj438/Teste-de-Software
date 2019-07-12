<?php include "head.php";

	?>
	<?php include "conexao.php";

	?>
 

	<div id="conteudo">
	<div class="container">
  	
        <?php
        $stmt = $dbh->prepare("SELECT * FROM noticias where tiponoticia='esporte' ");
        if ($stmt->execute()) {
            while ($row = $stmt->fetch()) {
        ?>
       
	<div class="row">
		<div class="col-md-23">	
	<br><br>
			<div class="card" style="width: 17rem;margin-left: 70px;margin-top: 50px;">
	
					 <img class="card-img-top" src="img/<?php echo $row['imagem'] ?>" alt="<?php echo $row['imagem'] ?>" style="height:150px;width:100%;">
				
						<div class="card-body">
								<h5 class="card-title"><?php echo $row['titulo'] ?></h5>
								
								<a href="N4.html" class="btn btn-dark">Ver Mais</a>

						</div>
			</div>
		</div>
		
	


	<?php
            }
        }
        ?>
        </div>  </div></div><br><br><br> 
    </div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
   </div>
	
	
	
	
	
	
	
   
	<?php
		$dbh = null;
	?>
<?php include "footer.php";

	?>

