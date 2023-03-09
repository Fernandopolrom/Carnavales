package view;

import java.util.Scanner;

public class Util {

	public static double leerDouble(String pregunta) {
		Scanner lectura = new Scanner(System.in);
		double respuesta;
		escribir(pregunta);
		respuesta = Double.parseDouble(lectura.nextLine());
		return respuesta;
	}

	public static int leerInt(String pregunta) {
		Scanner lectura = new Scanner(System.in);
		int respuesta;
		escribir(pregunta);
		respuesta = Integer.parseInt(lectura.nextLine());
		return respuesta;
	}

	public static char leerChar(String pregunta) {
		Scanner lectura = new Scanner(System.in);
		char respuesta;
		escribir(pregunta);
		respuesta = lectura.next().charAt(0);
		return respuesta;
	}

	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static void escribirError(String texto) {
		System.err.println(texto);
	}
	public static String leerString(String pregunta) {
		Scanner lectura = new Scanner(System.in);
		String respuesta;
		escribir(pregunta);
		respuesta = lectura.nextLine();
		return respuesta;
	}
	
}
