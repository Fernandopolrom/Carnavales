//Chirigota:
//Nombre
//Autor
//Autor de la música
//Autor de las letras
//Tipo (disfraz)
//Número de cuplés
//Puntos obtenidos


package model;

public class Chirigota extends AgrupacionOficial implements Callejera{
	
	
	private Integer numCuples;
	
	public Chirigota() {
		super();
		setNumCuples(0);
	}
	
	
	public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, Integer numCuples, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumCuples(numCuples);
		setPuntos(puntos);
	}
	
	
	public Integer getNumCuples() {
		return numCuples;
	}
	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}
	

	@Override
	public String toString() {
		return "------------------- \n Chirigota \n------------------- \nNumCuples()=" + getNumCuples() + ", \nPuntos()=" + getPuntos() + ", \nNombre()="
				+ getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica()
				+ ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}


	
	
	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación de la Chirigota " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		
		return "La Chirigota " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}


	@Override
	public String caminitoDelFalla() {
		
		return  "La Chirigota" + super.getNombre() + "va caminito del Falla";

	}


	@Override
	public String amoAEscucha() {
		
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}


	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
	}


	
	

}
