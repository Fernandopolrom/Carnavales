//Coro:
//Nombre
//Autor
//Autor de la música
//Autor de las letras
//Tipo (disfraz)
//Número de bandurrias
//Número de guitarras
//Puntos obtenidos

package model;

public class Coro extends AgrupacionOficial {

	private Integer numBandurrias;
	private Integer numGuitarras;


	public Coro() {
		super();
		setNumBandurrias(0);
		setNumGuitarras(0);

	}

	public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integer numBandurrias, Integer numGuitarras, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumBandurrias(numBandurrias);
		setNumGuitarras(numGuitarras);
		setPuntos(puntos);
	}

	public Integer getNumBandurrias() {
		return numBandurrias;
	}

	public void setNumBandurrias(Integer numBandurrias) {
		this.numBandurrias = numBandurrias;
	}

	public Integer getNumGuitarras() {
		return numGuitarras;
	}

	public void setNumGuitarras(Integer numGuitarras) {
		this.numGuitarras = numGuitarras;
	}

	

	@Override
	public String toString() {
		return "------------------- \n Coro \n------------------- \nNumBandurrias()=" + getNumBandurrias() + ", \nNumGuitarras()=" + getNumGuitarras()
				+ ",  \nPuntos()=" + getPuntos() + ",  \nNombre()=" + getNombre() + ",  \nAutor()=" + getAutor()
				+ ",  \nAutorMusica()=" + getAutorMusica() + ",  \nAutorLetra()=" + getAutorLetra()
				+ ",  \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}

	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Coro " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Coro " + super.getNombre() + " va de " + super.getTipoDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "El Coro" + super.getNombre() + "va caminito del Falla";

	}

	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
		
	}

	

	

	
	

}
