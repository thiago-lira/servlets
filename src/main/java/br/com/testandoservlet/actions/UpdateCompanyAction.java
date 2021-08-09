package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.db.Banco;
import br.com.testandoservlet.models.Empresa;

public class UpdateCompanyAction implements Action {
	public ResponseAction execute(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		Empresa empresa = Banco.getEmpresaById(id);

		if (empresa != null) {
			empresa.setNome(nome);
		}
		
		return new RedirectAction(res, "home?action=ReadCompanies");
	}
}
