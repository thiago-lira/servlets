package br.com.testandoservlet.db;

import java.util.ArrayList;
import java.util.List;

import br.com.testandoservlet.models.Empresa;
import br.com.testandoservlet.models.User;

public class Banco {
	private static int id = 1;
	private static List<Empresa> empresas = new ArrayList<>();
	private static List<User> usuarios = new ArrayList<>();

	public static void adiciona(Empresa empresa) {
		empresa.setId(id++);
		empresas.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		return empresas;
	}

	public static Empresa getEmpresaById(int id) {
		for (Empresa empresa : empresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}

		return null;
	}

	public static void remover(Empresa empresa) {
		empresas.remove(empresa);
	}

    public static User getUserWithCredentials(String name, String password) {
		usuarios.add(new User("thiago", "123"));
		for (User user : usuarios) {
			if (user.getName().equals(name) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public static void saveUser(User user) {
		usuarios.add(user);
	}
}
