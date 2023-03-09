package model;

import java.util.Comparator;

public class CompPuntos implements Comparator <AgrupacionOficial>{

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp;
		comp = o1.getPuntos().compareTo(o2.getPuntos());
		return comp;
	}
	

}
