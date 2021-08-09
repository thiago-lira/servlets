package br.com.testandoservlet.actions;

import br.com.testandoservlet.db.Banco;
import br.com.testandoservlet.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Action {
    @Override
    public ResponseAction execute(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = Banco.getUserWithCredentials(name, password);

        if (user != null) {
            request.setAttribute("user", user);
            return new RequestDispatcherAction(request, response, "WEB-INF/views/dashboard.jsp");
        }
        return new RedirectAction(response, "home");
    }
}
