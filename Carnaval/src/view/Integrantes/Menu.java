package view.Integrantes;

import model.AgrupacionOficial;
import model.Integrante;
import view.Util;

public class Menu {

	public static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 ->  add_participante();
			case 2 ->  eliminar_Participante();
			case 3 ->  editar_Participante();
			case 4 ->  listarParticipantes();
			case 5 ->  listarParticipAgru();
			case 6 ->  view.Principal.c.ordenar_por_nombre();
			}
		} while (opc != 0);
	}
	
	public static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir(" 	GESTION DE PARTICIPANTES ");
		Util.escribir("  ----------------------------------");
		Util.escribir(" 	1. Añadir un participante.");
		Util.escribir(" 	2. Borrar un participante.");
		Util.escribir(" 	3. Editar los datos de un participante.");
		Util.escribir("  	4. Listar todos los participantes.");
		Util.escribir("  	5. Listar agrupaciones donde es integrante.");
		Util.escribir("  	6. Ordenar por el nombre.");
	}
	
	public static void add_participante() {
		view.varios.Listar.listarAgruOficiles();
		int pos;
		pos = Util.leerInt("¿A que agrupación quiere usted agregar el pàrticipante?");
		
		Integrante i = new Integrante();
		editar_Participante(i);
		if (view.Principal.c.getAgrupa()[pos -1].insertarIntegrante(i)) {
			System.out.println("Integrante añadido con exito");
		}else {
			System.out.println("No se pudo añadir el Integrante");
		}
		
	}
	
	public static void eliminar_Participante() {

		if (view.varios.Listar.listarAgrupaciones()) {
			int pos;
			Integer posit = 0;
			pos = Util.leerInt("Elija la posición de la quieres ver los integrantes");
			pos--;
			if (listarParticipantes()) {
				posit = Util.leerInt("Elija el participante que quiere eliminar");
				posit--;
				view.Principal.ag.eliminarIntegrante(view.Principal.in);
			}
			if (view.Principal.c.getIntegrante()[posit - 1] == null) {
				Util.escribir("Eliminado con exito");
			} else {
				Util.escribir("No ha sido posible");
			}
		}

	}
	
	public static void editar_Participante() {

		if (view.varios.Listar.listarAgrupaciones()) {
			int pos;
			Integer posit = 0;
			pos = Util.leerInt("Elija la posición de la quieres ver los integrantes");
			pos--;
			if (listarParticipantes()) {
				posit = Util.leerInt("Elija el participante que quiere editar");
				posit--;
				editar_Participante(view.Principal.in);
			}
			if (view.Principal.c.getIntegrante()[posit - 1] == null) {
				Util.escribir("Eliminado con exito");
			} else {
				Util.escribir("No ha sido posible");
			}
		}

	}

	public static void editar_Participante(Integrante i) {
		
		String pregunta;
		String respuesta;

		pregunta = view.Principal.getPregunta("Nombre ", i.getNombre());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			i.setNombre(respuesta);
		}
		
		Integer respIn;
		pregunta = view.Principal.getPregunta("Edad ", i.getEdad().toString());
		respIn = Util.leerInt(pregunta);
		if (respuesta.length() > 0) {
			i.setEdad(respIn);
		}
		
		pregunta = view.Principal.getPregunta("Localidad ", i.getLocalidad());
		respuesta = Util.leerString(pregunta);
		if (respuesta.length() > 0) {
			i.setLocalidad(respuesta);
		}
	}
	
	public static void listarParticipAgru() {

		int codigoParticipante = Util.leerInt("Indique el codigo participante que quiere buscar");
		AgrupacionOficial[] agrupaciones = view.Principal.c.getAgrupa();
//		AgrupacionOficial[] agruConIntengrante = new AgrupacionOficial[10];
//		int contParticipante = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] != null) {
				Integrante[] integrantes = agrupaciones[i].getIntegrantes();
				for (int j = 0; j < integrantes.length; j++) {
					if (integrantes[j] != null && integrantes[j].getNumParticipante() == codigoParticipante) {
//						agruConIntengrante[contParticipante] = agrupaciones[i];
						System.out.println(agrupaciones[i]);
//						contParticipante++;
						break;
					}

				}
			}
		}

	}

	public static boolean listarParticipantes() {
		view.varios.Listar.listarAgruOficiles();
		int pos;
		pos = Util.leerInt("¿De que agrupación desea ver los participantes?");
		pos--;
		AgrupacionOficial agru = view.Principal.c.getAgrupa()[pos];

		boolean hayAgrupa = false;
		Integrante[] integrates = agru.getIntegrantes();
		for (int i = 0; i < integrates.length; i++) {
			if (integrates[i] != null) {
				hayAgrupa = true;
				break;
			}
		}
		if (hayAgrupa) {
			Util.escribir("LISTADO DE PARTICIPANTES");
			Util.escribir("--------------------------");
			Util.escribir("--------------------------");
			for (int i = 0; i < integrates.length; i++) {
				if (integrates[i] != null) {
					Util.escribir("" + (i + 1) + "" + integrates[i]);
				}
			}
		} else {
			Util.escribirError("No hay nada para mostrar");
		}
		return hayAgrupa;
	}











}
