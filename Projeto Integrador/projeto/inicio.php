<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
		<title>Aula 08 - parte 02</title>
	</head>
	<body>
		<script>
			function anuncio1(){
			document.getElementById('a1').src="bannerj.png";
			setTimeout("anuncio2()", 3000)
			}
			 
			function anuncio2(){
			document.getElementById('a1').src="bannerj.png";
			setTimeout("anuncio3()", 3000)
			}
			 
			function anuncio3(){
			document.getElementById('a1').src="bannerj.png";
			setTimeout("anuncio4()", 3000)
			}
			function anuncio4(){
			document.getElementById('a1').src="bannerj.png";
			setTimeout("anuncio1()", 3000)
			}
		</script>
		<div id="topo" style="width:95%;height:90px;">
			<center><h1>G2 NEWS<span class="badge badge-secondary">G2</span></h1></center>
		</div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			  <a class="navbar-brand" href="#">G2</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			  </button>
			<div class="row">
			  <div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
				  <li class="nav-item active">
					<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
				  </li>
				  <li class="nav-item">
					<a class="nav-link" href="#">Link</a>
				  </li>
				  <li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					  Dropdown
					</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					  <a class="dropdown-item" href="#">Action</a>
					  <a class="dropdown-item" href="#">Another action</a>
					  <div class="dropdown-divider"></div>
					  <a class="dropdown-item" href="#">Something else here</a>
					</div>
				  </li>
				  <li class="nav-item">
					<a class="nav-link disabled" href="#">Disabled</a>
				  </li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
				  <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				  <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			  </div>
			</nav>
		</div>
	
		
		<div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
		  <div class="carousel-inner">
			<div class="carousel-item active">
			  <img class="d-block w-100" src="bannerj.png" alt="First slide">
			</div>
			<div class="carousel-item">
			  <img class="d-block w-100" src="img2" alt="Second slide">
			</div>
			<div class="carousel-item">
			  <img class="d-block w-100" src=".../800x400?auto=yes&bg=555&fg=333&text=Third slide" alt="Third slide">
			</div>
		  </div>
		  <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		  </a>
		  <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		  </a>
		</div>
		
		<br>
		
		<div id="topo" style="width:95%;height:15px;">
				<center><h1>Notícias</h1></center>
			</div>
		</div>
		
		
		<br>
		
		<div class="container">
		<div class="row">
		<div class="col-md-24">
			<div class="card" style="width: 17rem;margin-left: 13px;margin-top: 50px;">
			  <img class="card-img-top" src="img.jpg" alt="Card image cap">
			  <div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-dark">Go somewhere</a>
			  </div>
			</div>
			</div>
			<div class="col-md-23">
			<div class="card" style="width: 17rem;margin-left: 13px;margin-top: 50px;">
			  <img class="card-img-top" src="img.jpg" alt="Card image cap">
			  <div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-dark">Go somewhere</a>
			  </div>
			</div>
			</div>
			<div class="col-md-22">
			<div class="card" style="width: 17rem;margin-left: 13px;margin-top: 50px;">
			  <img class="card-img-top" src="img.jpg" alt="Card image cap">
			  <div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-dark">Go somewhere</a>
			  </div>
			</div>
			</div>
			<div class="col-md-21">
			<div class="card" style="width: 17rem;margin-left: 13px;margin-top: 50px;">
			  <img class="card-img-top" src="img.jpg" alt="Card image cap">
			  <div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-dark">Go somewhere</a>
			  </div>
			</div>
			</div>
			
		
		
		<footer class="container-fluid" id="rodape" style="color:dark;">
			<div class="container d-flex justify-content-center">
		<img src="img.jpg" height="30"/>
		<span>&nbsp;&nbsp;&copy; 2018 Todos os direitos reservados</span>
		</div>
	
	</body>
</html>
