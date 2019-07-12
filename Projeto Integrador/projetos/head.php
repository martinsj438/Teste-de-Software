<!DOCTYPE html>
<html lang="PT-BR">
<head>
	<title>Esportes</title>
 	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
	<?php include "conexao.php";

	?>
		<nav class="navbar navbar-expand-lg navbar-light bg-light bg-dark">
			<img src="img/logo1.png"style="width: 5%;" >
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
				<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="home.html"><span style=" color: white;"><i class="fas fa-home"></i> Inicio <span class="sr-only"> página atual </span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="esporte.php"><span style=" color: white;"><i class="fas fa-users"></i> Esportes </a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="fakenews.php"><span style=" color: white;"><i class="fas fa-users"></i> Fake News </a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="economia.php"><span style=" color: white;"><i class="fas fa-users"></i> Economia </a>
				</li>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
				</form>
			</div>
		</nav><br>