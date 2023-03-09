

//Deseamos desarrollar una aplicación que nos sirva para gestionar las distintas Agrupacion del Carnaval de Cádiz, estén o no en el Concurso Oficial de Agrupaciones Carnavalescas (COAC).
//
//Necesitamos por tanto, almacenar la información de los siguientes tipos de Agrupacion:

//Todas las Agrupacion tienen que cantarPresentacion(), que devuelve una cadena que sea "Cantando la presentación de la Chirigota/Coro/... de nombre XXXXX") y tienen que hacerTipo() que devuelve un mensaje que sea "La Chirigota/Coro/....XXXXX va de YYYYY"), siendo XXXXX el nombre de la agrupación e YYYYY el tipo (disfraz) de la agrupación. Las Agrupacion de por sí no pueden existir a secas, sino que tiene que ser una de las formas anteriormente presentadas. Igualmente, las cuatro primeras (Coro, Comparsa, Chirigota, Cuarteto) se presentan al concurso oficial COAC, luego son un tipo de estas, es decir son, AgrupacionOficial. Y tampoco pueden existir por sí mismas, tienen que ser una de las cuatro posibles.
//
//Las AgrupacionOficial del COAC, tienen que poder gestionar los integrantes que la forman, por lo que tendrán dos métodos:
//
//boolean insertarIntegrante(Integrante i): Añade un integrante i a la agrupación oficial. Devolverá true si lo añadió o false en caso contrario.
//boolean eliminarIntegrante(Integrante i): Eliminar integrante i de la agrupación oficial. Devolverá true si lo eliminó o false en caso contrario.

//Las Agrupacion se ordenan por defecto por el nombre. Adicionalmente, se quiere ordenar por el autor, y las AgrupacionOficial también se quieren ordenar por puntos (PERO OJO, QUE NO ES SU ORDENACIÓN POR DEFECTO).
//
//Deberás decidir qué constructores necesitas según el enunciado.
//
//Deberás decidir qué atributos van en la/s superclase/s y cuáles quedan en la subclase/s.
//
//Todas las clases deben ser imprimibles, es decir, implementar el método toString():
//
//Se deberá crear un Main con todos los objetos necesarios para probar todos los métodos (a excepción de todos los Getters y Setters, sólo algunos de ambos).

package view;

import model.AgrupacionOficial;
import model.Agrupaciones;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;

import java.util.Arrays;
import java.util.Iterator;

import controller.Coac;

public class Principal {

	public static Coac c;
	public static AgrupacionOficial ag;
	public static Integrante in;
	public static Agrupaciones a;

	public static void main(String[] args) {
		gestionPrograma();

	}

	private static void gestionPrograma() {
		c = new Coac();
		c.precargarDatosParaPruebas();
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> view.Integrantes.Menu.opcIntegrantes();
			case 2 -> add_Agrupacion();
			case 3 -> eliminarAgrupacion();
			case 4 -> editarDatos();
			case 5 -> view.Concurso.Menu.opcConcurso();
			case 6 -> view.varios.Listar.listarAgrupaciones();
			case 7 -> view.varios.Listar.listarEnConcretoChirigota();
			case 8 -> view.varios.Listar.listarEnConcretoCoro();
			case 9 -> view.varios.Listar.listarEnConcretoComparsa();
			case 10 -> view.varios.Listar.listarEnConcretoCuarteto();
			case 11 -> view.varios.Listar.listarEnConcretoRomancero();
			case 12 -> c.ordenar_por_nombre();
			case 13 -> c.ordenar_por_autor();
			case 14 -> c.ordenar_por_autorLetra();
			case 15 -> c.ordenar_por_autorMusica();

			}
		} while (opc != 0);
		finDelPrograma();
	}

	

	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("      GESTION DE AGRUPACIONES      ");
		Util.escribir("  ----------------------------------");
		Util.escribir("    1. Gestión de Participantes.");
		Util.escribir("    2. Añadir una agrupación.");
		Util.escribir("    3. Eliminar una agrupación.");
		Util.escribir("    4. Editar datos de una agrupación.");
		Util.escribir("    5. Gestión del Concurso.");
		Util.escribir("  ----------------------------------");
		Util.escribir("       Listado de agrupaciones:");
		Util.escribir("  ----------------------------------");
		Util.escribir("    6. Listar todas.");
		Util.escribir("    7. Listar Chirigotas.");
		Util.escribir("    8. Listar Coros.");
		Util.escribir("    9. Listar Cuartetos.");
		Util.escribir("   10. Listar Comparsas.");
		Util.escribir("   11. Listar Romanceros.");
		Util.escribir("  ----------------------------------");
		Util.escribir("       Ordenar el listado:");
		Util.escribir("  ----------------------------------");
		Util.escribir("   12. Ordenar por el nombre.");
		Util.escribir("   13. Ordenar por el autor.");
		Util.escribir("   14. Ordenar por el autor de la letra.");
		Util.escribir("   15. Ordenar por el autor de la música.");
		Util.escribir("  ----------------------------------");
	}
	
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}



	private static void mostrarMenuTipoAgrupacion() {
		Util.escribir("\n");
		Util.escribir("   	TIPOS DE AGRUPACIONES  ");
		Util.escribir("  ----------------------------------");
		Util.escribir("		Por favor escoja una opción: ");
		Util.escribir(" 	1. Chirigota");
		Util.escribir(" 	2. Comparsa");
		Util.escribir("  	3. Coro");
		Util.escribir("  	4. Cuarteto");
		Util.escribir(" 	5. Romancero");

	}

	public static void add_Agrupacion() {
		int opc;
		do {
			mostrarMenuTipoAgrupacion();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			Agrupaciones agru;
			switch (opc) {
			case 1 -> {
				agru = new Chirigota();
				editarChirigota((Chirigota) agru);
				c.add_agrupacion(agru);
			}
			case 2 -> {
				agru = new Comparsa();
				editarComparsa((Comparsa) agru);
				c.add_agrupacion(agru);
			}
			case 3 -> {
				agru = new Coro();
				editarCoro((Coro) agru);
				c.add_agrupacion(agru);
			}
			case 4 -> {
				agru = new Cuarteto();
				editarCuarteto((Cuarteto) agru);
				c.add_agrupacion(agru);
			}
			case 5 -> {
				agru = new Romancero();
				editarRomancero((Romancero) agru);
				c.add_agrupacion(agru);
			}
			}
		} while (opc != 0);
		mostrarMenuPrincipal();

	}

	private static void editarChirigota(Chirigota ch) {
		String pregunta;
		Integer respuesta;

		Util.escribir("\nDatos de la Chirigota");

		pregunta = getPregunta("Número de cuples ", ch.getNumCuples().toString());
		respuesta = Util.leerInt(pregunta);
		if (respuesta > 0) {
			ch.setNumCuples(respuesta);
		}

		datosAgrupaGenericos(ch);
	}

	private static void editarComparsa(Comparsa c) {
		String pregunta;
		String respuesta;

		Util.escribir("\nDatos de la Comparsa");

		pregunta = getPregunta("Empresa de Atrezzo ", c.getEmpresaAtrezzo());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			c.setEmpresaAtrezzo(respuesta);
		}

		datosAgrupaGenericos(c);
	}

	private static void editarCoro(Coro c) {
		String pregunta;
		Integer respuesta;

		Util.escribir("\nDatos del Coro");

		pregunta = getPregunta("Número de bandurrias ", c.getNumBandurrias().toString());
		respuesta = Util.leerInt(pregunta);
		if (respuesta > 0) {
			c.setNumBandurrias(respuesta);
		}
		pregunta = getPregunta("Número de guitarras ", c.getNumGuitarras().toString());
		respuesta = Util.leerInt(pregunta);
		if (respuesta > 0) {
			c.setNumGuitarras(respuesta);
		}

		datosAgrupaGenericos(c);
	}

	private static void editarCuarteto(Cuarteto c) {
		String pregunta;
		Integer respuesta;

		Util.escribir("\nDatos de la Cuarteto");

		pregunta = getPregunta("Números de Integrantes ", c.getNumMiembros().toString());
		respuesta = Util.leerInt(pregunta);
		if (respuesta > 0) {
			c.setNumMiembros(respuesta);
		}

		datosAgrupaGenericos(c);
	}

	private static void editarRomancero(Romancero r) {
		String pregunta;
		String respuesta;

		Util.escribir("\nDatos del Romancero");

		pregunta = getPregunta("Temática de Cartel ", r.getTematicaCartel());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			r.setTematicaCartel(respuesta);
		}

		datosAgrupaGenericos(r);
	}

	private static void datosAgrupaGenericos(Agrupaciones agru) {
		String pregunta;
		String respuesta;

		pregunta = getPregunta("Nombre ", agru.getNombre());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			agru.setNombre(respuesta);
		}
		pregunta = getPregunta("Autor ", agru.getAutor());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			agru.setAutor(respuesta);
		}

		pregunta = getPregunta("Autor Musica ", agru.getAutorMusica());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			agru.setAutorMusica(respuesta);
		}

		pregunta = getPregunta("Autor Letra ", agru.getAutorLetra());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			agru.setAutorLetra(respuesta);
		}

		pregunta = getPregunta("Tipo de Disfraz ", agru.getTipoDisfraz());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			agru.setTipoDisfraz(respuesta);
		}
	}

	public static String getPregunta(String texto, String valor) {

		String pregunta = "";
		if (valor != null && !valor.equals("null") && !valor.equals("")) {
			pregunta = texto + "[" + valor + "]";
		} else {
			pregunta = texto;
		}
		return pregunta;
	}

	private static void eliminarAgrupacion() {

		if (view.varios.Listar.listarAgrupaciones()) {
			int pos;
			pos = Util.leerInt("Elija la posición del elemento que quiere eliminar");
			pos--;
			if (c.eliminar_agrupacion(pos)) {
				Util.escribir("Eliminado con exito");
			} else {
				Util.escribir("No ha sido posible");
			}
		}

	}

	private static void editarDatos() {
		if (view.varios.Listar.listarAgrupaciones()) {
			int pos;
			pos = Util.leerInt("Elija la posición del elemento que quiere editar");
			pos--;
			Agrupaciones agrupa = c.getAgrupacion(pos);

			if (agrupa instanceof Chirigota) {
				editarChirigota((Chirigota) agrupa);
			}
			if (agrupa instanceof Comparsa) {
				editarComparsa((Comparsa) agrupa);
			}
			if (agrupa instanceof Coro) {
				editarCoro((Coro) agrupa);
			}
			if (agrupa instanceof Cuarteto) {
				editarCuarteto((Cuarteto) agrupa);
			}
			if (agrupa instanceof Romancero) {
				editarRomancero((Romancero) agrupa);
			}
		}

	}



	
	

	


	
	

}
