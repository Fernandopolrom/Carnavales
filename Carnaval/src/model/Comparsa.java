//Comparsa:
//Nombre
//Autor
//Autor de la música
//Autor de las letras
//Tipo (disfraz)
//Empresa de atrezzo
//Puntos obtenidos

package model;

public class Comparsa extends AgrupacionOficial{

	private String empresaAtrezzo;


	public Comparsa() {
		super();
		setEmpresaAtrezzo("");

	}

	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			String empresaAtrezzo, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setEmpresaAtrezzo(empresaAtrezzo);
		setPuntos(puntos);
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}

	

	@Override
	public String toString() {
		return "------------------- \n Comparsa \n------------------- \nEmpresaAtrezzo()=" + getEmpresaAtrezzo() + ", \nPuntos()=" + getPuntos()
				+ ", \nNombre()=" + getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()="
				+ getAutorMusica() + ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz()
				+ "]";
	}

	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación de la Comparsa " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "La Comparsa " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}


	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "La Comparsa " + super.getNombre() + " va caminito del Falla";

	}

	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
	
	}



}
