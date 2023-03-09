//Por tanto, es necesario implementar también la clase Integrante, que simplemente almacenará el numeroParticipante , nombre, edad (sólo mayor de edad) y localidad del participante.

package model;

public class Integrante {

	private static int contParticipantes = 0;
	private Integer numParticipante;
	private String nombre;
	private Integer edad;
	private String localidad;

	public Integrante() {
		setNombre("");
		setEdad(18);
		setLocalidad("");
		this.numParticipante = Integrante.codigoParticipante();
	}

	public Integrante(String nombre, Integer edad, String localidad) {
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
		this.numParticipante = Integrante.codigoParticipante();
	}

	public Integer getNumParticipante() {
		return numParticipante;
	}

	private static Integer codigoParticipante() {

		contParticipantes++;
		return contParticipantes;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Integrante [getNumParticipante()=" + getNumParticipante() + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getLocalidad()=" + getLocalidad() + "]";
	}
	
	

}
