<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
    <form action="efetuaLogin" method="post">
        Login: <input type="text" name="login"/><br/>
        Senha: <input type="text" name="senha"/><br/>
        <input type="submit" value="Entrar na lista de contas"/>
    </form>
</body>
</html>