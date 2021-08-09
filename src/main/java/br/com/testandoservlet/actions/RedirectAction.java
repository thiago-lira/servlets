package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class RedirectAction implements ResponseAction {
	private HttpServletResponse res;
	private String view;

	public RedirectAction(HttpServletResponse res, String view) {
		this.res = res;
		this.view = view;
	}

	@Override
	public void execute() throws ServletException, IOException {
		res.sendRedirect(view);
	}
}
