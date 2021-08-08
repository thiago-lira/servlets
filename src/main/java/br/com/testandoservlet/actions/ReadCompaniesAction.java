package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.servlet.db.Banco;

public class ReadCompaniesAction implements Action {
	public ResponseAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("empresas", Banco.getEmpresas());

		return new RequestDispatcherAction(request, response, "WEB-INF/views/empresas.jsp");
	}
}
