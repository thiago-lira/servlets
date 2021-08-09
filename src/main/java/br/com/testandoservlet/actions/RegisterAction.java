package br.com.testandoservlet.actions;

import br.com.testandoservlet.db.Banco;
import br.com.testandoservlet.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction implements Action {
    @Override
    public ResponseAction execute(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Banco.saveUser(new User(name, password));

        return new RedirectAction(response, "home?action=LoginForm");
    }
}
