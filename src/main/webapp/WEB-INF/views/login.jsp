<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h1>
        Login
    </h1>

    <form action="/TestandoServlet/home?action=Login" method="post">
        <label>
            Nome: <br />
            <input type="text" name="name">
        </label>

        <label>
            Senha: <br />
            <input type="password" name="password">
        </label>

        <button>Login</button>
    </form>
</body>
</html>
