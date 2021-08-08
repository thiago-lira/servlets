<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<p>Confirma a exclusão da empresa ${ empresa.getNome() }?</p>

		<input type="hidden" name="id" value="${ empresa.getId() }" />

		<button>
			Excluir
		</button>
	</form>
</body>
</html>