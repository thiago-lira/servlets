package br.com.testandoservlet.actions;

import java.io.IOException;

import javax.servlet.ServletException;

public interface ResponseAction {
	void execute() throws ServletException, IOException;
}
