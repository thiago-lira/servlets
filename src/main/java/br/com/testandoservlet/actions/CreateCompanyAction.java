package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.servlet.db.Banco;
import br.com.testandoservlet.servlet.models.Empresa;

public class CreateCompanyAction implements Action {
	public ResponseAction execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String empresa = request.getParameter("empresa");

		Banco.adiciona(new Empresa(empresa));
		
		request.setAttribute("empresa", empresa);

		RequestDispatcherAction action = new RequestDispatcherAction(request, response, "home?action=ReadCompanies");

		return action;
	}
}
