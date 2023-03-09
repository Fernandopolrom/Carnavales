package view.Concurso;

import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import view.Util;

public class Menu {

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> vaCaminitoDelFalla();
			case 2 -> hacenTipo();
			case 3 -> cantarPresentacion();
			case 4 -> asigPuntos();
			case 5 -> view.varios.Listar.listarAgruOficiles();
			case 6 -> view.varios.Listar.listarEnConcretoChirigota();
			case 7 -> view.varios.Listar.listarEnConcretoCoro();
			case 8 -> view.varios.Listar.listarEnConcretoCuarteto();
			case 9 -> view.varios.Listar.listarEnConcretoComparsa();
			case 10 -> view.Principal.c.ordenar_por_puntos();
			case 12 -> view.Principal.c.ordenar_por_nombre();
			case 13 -> view.Principal.c.ordenar_por_autor();
			case 14 -> view.Principal.c.ordenar_por_autorLetra();
			case 15 -> view.Principal.c.ordenar_por_autorMusica();

			}
		} while (opc != 0);
	}

	public static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir(" 	GESTION DEL CONCURSO ");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Concurso:");
		Util.escribir("  ----------------------------------");
		Util.escribir("  	1. Va camino del Falla.");
		Util.escribir(" 	2. Hacen el Tipo.");
		Util.escribir(" 	3. Canta la Presentación.");
		Util.escribir(" 	4. Asignar puntos.");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Listado de agrupaciones participantes:");
		Util.escribir("  ----------------------------------");
		Util.escribir("  	5. Listar todos.");
		Util.escribir("  	6. Listar Chirigotas.");
		Util.escribir(" 	7. Listar Coros.");
		Util.escribir(" 	8. Listar Cuartetos.");
		Util.escribir(" 	9. Listar Comparsas.");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Ordenación del listado:");
		Util.escribir("  ----------------------------------");
		Util.escribir(" 	10. Ordenar por puntos.");
		Util.escribir(" 	11. Ordenar por el nombre.");
		Util.escribir("	    12. Ordenar por el autor.");
		Util.escribir(" 	13. Ordenar por autor de música/letra.");
	}

	public static void mostrarMenuFalla() {

		Util.escribir("\nEscoja una opción: ");
		Util.escribir("  1. Chirigota");
		Util.escribir("  2. Comparsa");
		Util.escribir("  3. Coro");
		Util.escribir("  4. Cuarteto");
	}



	public static void asigPuntos() {

		int pos;
		view.varios.Listar.listarAgruOficiles();
		pos = Util.leerInt("Elija la posición del elemento al que quieres asignar puntos");
		pos--;
		if (pos < view.Principal.c.getAgrupa().length) {
			AgrupacionOficial agruOfi = view.Principal.c.getAgrupa()[pos];
			if (agruOfi != null) {
				Integer puntosAnt = agruOfi.getPuntos();

				int respuesta;
				respuesta = Util.leerInt("¿Cuántos puntos quiere asignarle a esta agrupación?");
				agruOfi.setPuntos(respuesta + puntosAnt);
				System.out.println(agruOfi.getPuntos());
			} else {
				System.err.println("No existe una agrupación en esta posición");
			}

		} else {
			System.out.println("Posición no valida");
		}

	}

	public static void cantarPresentacion() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
			case 2:
				agruOfi = new Comparsa();
			case 3:
				agruOfi = new Coro();
			case 4:
				agruOfi = new Cuarteto();
			case 5:
				if (agruOfi != null) {
					String tipo = agruOfi.cantarPresentacion();
					System.out.println(tipo);
				} else {
					System.out.println("Aún no se ha seleccionado una agrupación.");
				}
				break;
			}
		} while (opc != 0);
	}

	public static void hacenTipo() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
			case 2:
				agruOfi = new Comparsa();
			case 3:
				agruOfi = new Coro();
			case 4:
				agruOfi = new Cuarteto();
			case 5:
				if (agruOfi != null) {
					String tipo = agruOfi.hacerTipo();
					System.out.println(tipo);
				} else {
					System.out.println("Aún no se ha seleccionado una agrupación.");
				}
				break;
			}
		} while (opc != 0);
	}

	public static void vaCaminitoDelFalla() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
				break;
			case 2:
				agruOfi = new Comparsa();
				break;
			case 3:
				agruOfi = new Coro();
				break;
			case 4:
				agruOfi = new Cuarteto();
				break;
			}
			if (agruOfi != null) {
				String tipo = agruOfi.caminitoDelFalla();
				System.out.println(tipo);
			} else {
				System.out.println("Opción no valida");
			}

		} while (opc != 0);
	}

	
}
