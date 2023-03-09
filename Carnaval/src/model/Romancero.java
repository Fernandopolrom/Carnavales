//Romancero:
//Nombre
//Autor
//Autor de la música
//Autor de las letras
//Tipo (disfraz)
//Temática del cartelón

package model;

public class Romancero extends Agrupaciones implements Callejera{

	private String tematicaCartel;
	

	public Romancero() {
		super();
		setTematicaCartel("");
	}
	
	
	public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String tematicaCartel) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setTematicaCartel(tematicaCartel);
	}
	

	public String getTematicaCartel() {
		return tematicaCartel;
	}

	public void setTematicaCartel(String tematicaCartel) {
		this.tematicaCartel = tematicaCartel;
	}


	@Override
	public String toString() {
		return "Romancero [getTematicaCartel()=" + getTematicaCartel() + ", getNombre()=" + getNombre()
				+ ", getAutor()=" + getAutor() + ", getAutorMusica()=" + getAutorMusica() + ", getAutorLetra()="
				+ getAutorLetra() + ", getTipoDisfraz()=" + getTipoDisfraz() + "]";
	}


	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Romancero " + getNombre();
	}

	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Romancero " + getNombre() + " va de " + getTipoDisfraz();

	}


	@Override
	public String amoAEscucha() {
		String cadena;
		return cadena = "Amo a escuchá el Romancero " + super.getNombre();
	}


	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
		
	}


	
	
	
	
	
	
	
}
