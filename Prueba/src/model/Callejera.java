//Adicionalmente, las Chirigota, Cuarteto y Romancero son un tipo de agrupaciones especiales que también podemos ver en la calle, por lo que implementan la interfaz Callejera, que incluye un único método amoAescucha(). En cada una de las clases se implemente esta interfaz, el método simplemente devolverá una cadena "Amo a escuchá la Chirigota/Cuarteto/Romanero XXXXX", siendo XXXXX el nombre de la agrupación.
//

package model;

public interface Callejera {
	
	public String amoAEscucha();
	

}
