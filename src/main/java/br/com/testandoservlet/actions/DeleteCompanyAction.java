package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.db.Banco;
import br.com.testandoservlet.models.Empresa;

public class DeleteCompanyAction implements Action {
	public ResponseAction execute(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Empresa empresa = Banco.getEmpresaById(id);

		if (empresa != null) {
			Banco.remover(empresa);
		}

		return new RedirectAction(res, "home?action=ReadCompanies");
	}
}
