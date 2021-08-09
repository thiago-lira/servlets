package br.com.testandoservlet.servlet;

import br.com.testandoservlet.actions.Action;
import br.com.testandoservlet.actions.ResponseAction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class Gateway extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String paramAction = req.getParameter("action");

		if (paramAction == null) {
			req.getRequestDispatcher("WEB-INF/views/index.jsp").forward(req, res);
		}

		String className = "br.com.testandoservlet.actions." + paramAction + "Action";
		ResponseAction responseAction = null;
		try {
			Class clazz = Class.forName(className);
			Action action = (Action) clazz.newInstance();
			responseAction = action.execute(req, res);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		responseAction.execute();
	}
}
