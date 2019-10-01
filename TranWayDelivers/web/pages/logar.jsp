<%-- 
    Document   : cadastro
    Created on : Oct 1, 2019, 1:22:28 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/estilo.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>

        <!-- menu -->
        <nav class="navbar sticky-top navbar-expand-md navbar-dark navbar-transparente">
            <!-- Brand -->
            <a class="navbar-brand text-dark" href="../index.jsp">Logo</a>

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
                        <a class="nav-link text-dark" href="cadastro.jsp">Cadastre-se</a>
                    </li>
                    <li class="nav-item nav-right">
                        <a class="nav-link text-dark" href="">Logar</a>
                    </li>
                </ul>
            </div>
        </nav><!-- final menu-->
        
        <!-- espaco entre menu e o conteudo-->
        <div class="container">
            <div class="espaco row ">
            </div>
        </div>
        
        <!-- form login -->
        <div class="container">
            <div class="row">
                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="../download.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                        <h4 class="card-title">John Doe</h4>
                        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                        <a href="#" class="btn btn-primary">See Profile</a>
                    </div>                
                </div>
            <div class="col-md-4">
                <form action="../index.jsp" method="post">
                    <div class="form-group">
                        <label for="email">Email: </label>
                        <input type="email" class="form-control" id="email">
                    </div>
                    <div class="form-group">
                        <label for="pwd">Senha: </label>
                        <input type="password" class="form-control" id="pwd">
                    </div>
                    <button type="submit" class="btn btn-primary">Logar</button>
                </form>
                </div>
                <div class="card col-md-4" style="width:400px">
                    <img class="card-img-top" src="../download.jpg" alt="Card image" style="width:100%">
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
