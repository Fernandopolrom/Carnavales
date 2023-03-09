//Las AgrupacionOficial del COAC, tienen que poder gestionar los integrantes que la forman, por lo que tendrán dos métodos:
//
//boolean insertarIntegrante(Integrante i): Añade un integrante i a la agrupación oficial. Devolverá true si lo añadió o false en caso contrario.
//boolean eliminarIntegrante(Integrante i): Eliminar integrante i de la agrupación oficial. Devolverá true si lo eliminó o false en caso contrario.
//Cualquier AgrupacionOficial tendrá que implementar obligatoriamente el método caminitoDelFalla() que devolverá una cadena diciendo "El/la coro/comparsa/chirigota/cuarteto XXXXX va caminito del Falla" según corresponda, siendo XXXXX el nombre de la agrupación.
//

package model;

import java.util.Arrays;


public abstract class AgrupacionOficial extends Agrupaciones{

	private Integrante[] integrantes;
	private Integer puntos;

	public AgrupacionOficial() {
		super();
		setIntegrantes(new Integrante[10]);

	}

	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integrante[] numIntegrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setIntegrantes(numIntegrante);
	}

	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] numIntegrante) {
		this.integrantes = numIntegrante;
	}
	
	

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public boolean insertarIntegrante(Integrante integ) {
		boolean insertar = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] == null) {
				integrantes[i] = integ;
				insertar = true;
				break;
			} else {
				insertar = false;
			}
		}

		return insertar;
	}

	public boolean eliminarIntegrante(Integrante integ) {
		boolean eliminar = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i]!= null &&  integrantes[i].equals(integ)) {
				integrantes[i] = null;
				eliminar = true;
			} else {
				eliminar = false;
			}
		}

		return eliminar;
	}

	public abstract String caminitoDelFalla();
	
	
	
	@Override
	public String toString() {
		return "AgrupacionOficial \nNumIntegrante()=" + Arrays.toString(getIntegrantes()) + ", \nPuntos()="
				+ getPuntos() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", \nNombre()=" + getNombre()
				+ ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica() + ", \nAutorLetra()="
				+ getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", hacerTipo()=" + hacerTipo() + "]";
	}

	
	
	
	

}
