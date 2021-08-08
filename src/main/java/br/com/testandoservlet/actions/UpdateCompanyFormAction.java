package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandoservlet.servlet.db.Banco;
import br.com.testandoservlet.servlet.models.Empresa;

public class UpdateCompanyFormAction implements Action {
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Empresa empresa = Banco.getEmpresaById(id);

		if (empresa != null ) {
			req.setAttribute("empresa", empresa);
			return "forward:form-atualiza.jsp";
		}
		return "redirect:home?action=ReadCompanies";
	}
}
