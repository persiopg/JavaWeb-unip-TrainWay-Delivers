<%-- 
    Document   : menu
    Created on : 07/10/2019, 08:55:22
    Author     : alunos02
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "menu" %>

<nav class="navbar sticky-top navbar-expand-md navbar-dark navbar-transparente">
    <!-- Brand -->
    <a class="navbar-brand text-dark" href="index.jsp">Logo</a>

    <!-- Button -->
    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#demo">                
        <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Navbar links -->
    <div class="collapse navbar-collapse" id="demo">
        <ul class="navbar-nav ">
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
                <a class="nav-link text-dark" href="logar.jsp">Logar</a>
            </li>
        </ul>
    </div>
</nav>
