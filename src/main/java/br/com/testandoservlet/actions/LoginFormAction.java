package br.com.testandoservlet.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFormAction implements Action {
    private HttpServletResponse res;

    @Override
    public ResponseAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return new RequestDispatcherAction(request, response, "WEB-INF/views/login.jsp");
    }
}
