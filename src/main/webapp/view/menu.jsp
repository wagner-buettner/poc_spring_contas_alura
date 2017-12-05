<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bem Vindo!</title>
</head>
<body>
<h2>Página inicial da Lista de Contas</h2>
<p>Bem vindo, ${usuarioLogado.login}</p>
<a href="listaContas">Clique aqui</a> para acessar a lista de contas<br/>
<a href="logout">Sair do Sistema</a>
</body>
</html>