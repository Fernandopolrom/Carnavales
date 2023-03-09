package view.varios;

import model.AgrupacionOficial;
import model.Agrupaciones;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Romancero;
import view.Util;

public class Listar {

	public static boolean listarAgrupaciones() {

		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null) {
				hayAgrupa = true;
				break;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE AGRUPACIONES");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}
		return hayAgrupa;
	}
	
	public static void listarEnConcretoChirigota() {
		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null && agrupa[i] instanceof Chirigota) {
				hayAgrupa = true;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE CHIRIGOTAS");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null && agrupa[i] instanceof Chirigota) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}

	}

	public static void listarEnConcretoComparsa() {
		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null && agrupa[i] instanceof Comparsa) {
				hayAgrupa = true;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE COMPARSAS");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null && agrupa[i] instanceof Comparsa) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}

	}

	public static void listarEnConcretoCoro() {
		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null && agrupa[i] instanceof Coro) {
				hayAgrupa = true;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE COROS");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null && agrupa[i] instanceof Coro) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}

	}

	public static void listarEnConcretoCuarteto() {
		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null && agrupa[i] instanceof Cuarteto) {
				hayAgrupa = true;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE CUARTETOS");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null && agrupa[i] instanceof Cuarteto) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}

	}

	public static void listarEnConcretoRomancero() {
		boolean hayAgrupa = false;
		Agrupaciones[] agrupa = view.Principal.c.getAgrupaciones();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null && agrupa[i] instanceof Romancero) {
				hayAgrupa = true;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE ROMANCEROS");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null && agrupa[i] instanceof Romancero) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}

	}

	public static boolean listarAgruOficiles() {

		boolean hayAgrupa = false;
		AgrupacionOficial[] agrupa = view.Principal.c.verAgrupacion();
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] != null) {
				hayAgrupa = true;
				break;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE AGRUPACIONES OFICIALES");
			Util.escribir("-----------------------");
			Util.escribir("-----------------------");
			for (int i = 0; i < agrupa.length; i++) {
				if (agrupa[i] != null) {
					Util.escribir("" + (i + 1) + "" + agrupa[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}
		return hayAgrupa;
	}
}
