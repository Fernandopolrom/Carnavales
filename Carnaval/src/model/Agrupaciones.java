package model;

public abstract class Agrupaciones implements Comparable <Agrupaciones> {

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetra;
	private String tipoDisfraz;

	public Agrupaciones() {
		setNombre("");
		setAutor("");
		setAutorMusica("");
		setAutorLetra("");
		setTipoDisfraz("");
	}

	public Agrupaciones(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
		setNombre(nombre);
		setAutor(autor);
		setAutorMusica(autorMusica);
		setAutorLetra(autorLetra);
		setTipoDisfraz(tipoDisfraz);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetra() {
		return autorLetra;
	}

	public void setAutorLetra(String autorLetra) {
		this.autorLetra = autorLetra;
	}

	public String getTipoDisfraz() {
		return tipoDisfraz;
	}

	public void setTipoDisfraz(String tipoDisfraz) {
		this.tipoDisfraz = tipoDisfraz;
	}

	public abstract String cantarPresentacion();

	public abstract String hacerTipo();
	
	
	public int compareTo(Agrupaciones obj) {
		int comp;
		comp = getNombre().compareTo(obj.getNombre());
		return comp;
		
	}


	

	@Override
	public String toString() {
		return "Agrupaciones:  \nNombre()=" + getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()="
				+ getAutorMusica() + ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz()
				+ "";
	}

}
