package br.com.testandoservlet.servlet.db;

import java.util.ArrayList;
import java.util.List;

import br.com.testandoservlet.servlet.models.Empresa;

public class Banco {
	private static int id = 1;
	private static List<Empresa> empresas = new ArrayList<>();

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
}
