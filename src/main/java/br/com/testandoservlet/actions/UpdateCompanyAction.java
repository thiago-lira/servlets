package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.servlet.db.Banco;
import br.com.testandoservlet.servlet.models.Empresa;

public class UpdateCompanyAction implements Action {
	public String execute(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		Empresa empresa = Banco.getEmpresaById(id);

		if (empresa != null) {
			empresa.setNome(nome);
		}
		
		return "redirect:home?action=ReadCompanies";
	}
}
