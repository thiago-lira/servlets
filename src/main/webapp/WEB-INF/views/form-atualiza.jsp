<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/TestandoServlet/home?action=UpdateCompany" method="POST">
		<input type="hidden" name="id" value="${ empresa.getId() }" />

		<input type="text" name="nome" value="${ empresa.getNome() }" />

		<button>Atualizar</button>
	</form>
</body>
</html>