

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="menu" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TrainWay Delivers</title>
        <link href="./css/estilo.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <header class="cabecario">
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
                                    <img src="Img/subwayLanche.jpg" class="d-block w-100 imgCarrosel">
                                  <div class="carousel-caption d-none d-md-block">
                                    <h5>First slide label</h5>
                                    <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                                  </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="Img/download.jpg" class="d-block w-100 imgCarrosel">
                                  <div class="carousel-caption d-none d-md-block">
                                    <h5>Second slide label</h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                                  </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="Img/lanche.jpg" class="d-block w-100 imgCarrosel" >
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
        </header>
        <menu:import url="menu.jsp"/>
        <jsp:useBean id="tes" class="Dao.daoCaminho" scope="session"/>
            
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
                    <img class="card-img-top" src="Img/download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                        <h4 class="card-title">John Doe</h4>
                        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                        <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>

                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="Img/download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                      <h4 class="card-title">John Doe</h4>
                      <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                      <a href="#" class="btn btn-primary">See Profile</a>
                    </div>
                </div>
                
                <div class="card col-md-4" style="width:400px">
                    <form action="pagViewLsnche.jsp" >
                        <img class="card-img-top" src="${tes.caminho}" alt="Card image" style="width:100%">
                        <div class="card-body">
                          <h4 class="card-title" name="lanche" value="lanche">MC feliz</h4>
                          <p class="card-text" value="descLanche" name="descLanche">Some example text some example text. John Doe is an architect and engineer</p>
                          <input type="submit" class="btn btn-primary" value="ver"/>
                        </div>
                    </form>
                </div>
                
            </div>
        </div>
        
        <!-- Js boostrap -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper</.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
