//Cuarteto:
//Nombre
//Autor
//Autor de la música
//Autor de las letras
//Tipo (disfraz)
//Número de miembros
//Puntos obtenidos

package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	
	private Integer numMiembros;

	
	public Cuarteto() {
		super();
		setNumMiembros(0);
		
	}
	
	
	
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,Integer numMiembros, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumMiembros(numMiembros);
		setPuntos(puntos);
	}
	
	
	
	
	public Integer getNumMiembros() {
		return numMiembros;
	}
	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}
	



	@Override
	public String toString() {
		return "------------------- \n Coro \n------------------- \nNumMiembros()=" + getNumMiembros() + ", \nPuntos()=" + getPuntos() + ", \nNombre()="
				+ getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica()
				+ ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}



	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Cuarteto " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Cuarteto " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}



	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "El Cuarteto" + super.getNombre() + "va caminito del Falla";

	}



	@Override
	public String amoAEscucha() {
		String cadena;
		return cadena = "Amo a escuchá el Cuarteto " + super.getNombre();
		
		
	}



	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
	}






	
	
	
	

}
