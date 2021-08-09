<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro de Usuário</title>
</head>
<body>
<form action="/TestandoServlet/home?action=Register" method="post">
    <p>
        <label>
            Nome:<br />
            <input type="text" name="name">
        </label>
    </p>

    <p>
        <label>
            Senha:<br />
            <input type="password" name="password">
        </label>
    </p>

    <button>Cadastrar</button>
</form>
</body>
</html>
