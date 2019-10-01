<%-- 
    Document   : index
    Created on : 30/09/2019, 09:12:34
    Author     : persio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TrainWay Delivers</title>
        <link href="./css/estilo.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <!-- carrosel side -->
        <div class="container">
            <div class="row">
                <div class="col-md-12">                
                    <div class="bd-example">
                        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                          <ol class="carousel-indicators">
                            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                          </ol>
                          <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="subwayLanche.jpg" class="d-block w-100 imgCarrosel">
                              <div class="carousel-caption d-none d-md-block">
                                <h5>First slide label</h5>
                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                              </div>
                            </div>
                            <div class="carousel-item">
                                <img src="download.jpg" class="d-block w-100 imgCarrosel">
                              <div class="carousel-caption d-none d-md-block">
                                <h5>Second slide label</h5>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                              </div>
                            </div>
                            <div class="carousel-item">
                                <img src="lanche.jpg" class="d-block w-100 imgCarrosel" >
                              <div class="carousel-caption d-none d-md-block">
                                <h5>Third slide label</h5>
                                <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                              </div>
                            </div>
                          </div>
                          <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                          </a>
                          <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                          </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- menu -->
        <nav class="navbar sticky-top navbar-expand-md navbar-dark navbar-transparente">
            <!-- Brand -->
            <a class="navbar-brand text-dark" href="#">Logo</a>
            
            <!-- Button -->
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#demo">                
                <span class="navbar-toggler-icon"></span>
            </button>
            
            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="demo">
                <ul class="navbar-nav ">
                    <li class="nav-item">
                        <a class="nav-link text-dark" href="#">Promoções</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-dark" href="#">Monte o seu!</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-dark" href="#">Carrinho</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-dark" href="./pages/cadastro.jsp">Cadastre-se</a>
                    </li>
                    <li class="nav-item nav-right">
                        <a class="nav-link text-dark" href="pages/logar.jsp">Logar</a>
                    </li>
                </ul>
            </div>
        </nav><!-- final menu-->
        
        <!-- espaco entre menu e o conteudo-->
        <div class="container">
            <div class="espaco row ">
                <h1 class="col-md-12">TranWay Delivers</h1>
            </div>
        </div>
        <!-- card lanches prontos -->
        <div class="container cardLanche">
            <div class="row">
                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                        <h4 class="card-title">John Doe</h4>
                        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                        <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>

                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                      <h4 class="card-title">John Doe</h4>
                      <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                      <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>

                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                      <h4 class="card-title">John Doe</h4>
                      <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                      <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>

                <div class="card col-md-4 " style="width:400px">
                    <img class="card-img-top" src="download.jpg" alt="Card image" style="width:100%;">
                    <div class="card-body">
                      <h4 class="card-title">John Doe</h4>
                      <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                      <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Js boostrap -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper</.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
