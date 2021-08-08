package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherAction implements ResponseAction {
	private HttpServletRequest req;
	private HttpServletResponse res;
	private String view;

	public RequestDispatcherAction(HttpServletRequest req, HttpServletResponse res, String view) {
		this.req = req;
		this.res = res;
		this.view = view;
	}

	@Override
	public void execute() throws ServletException, IOException {
		req.getRequestDispatcher(view).forward(req, res);
	}
}
