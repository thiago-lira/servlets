<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="br.com.testandoservlet.servlet.models.Empresa, java.util.List" %>
<%
	List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		Empresa ${ empresa } cadastrada com sucesso
	</p>
	<ul>
		<%
		for (Empresa empresa : empresas) {
			out.println("<li>");
			out.println(empresa.getNome());
			out.println("<a href=\"/TestandoServlet/home?action=UpdateCompanyForm&id=" + empresa.getId() +"\"> Editar</a>");
			out.println("<a href=\"/TestandoServlet/home?action=DeleteCompany&id=" + empresa.getId() +"\"> Excluir</a>");
			out.println("</li>");
		}
		%>
	</ul>
</body>
</html>