package model;

import java.Util.Comparator;

public class CompAuLe implements Comparator <Agrupaciones>{

	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {
		int comp;
		comp = o1.getAutorLetra().compareTo(o2.getAutorLetra());
		return comp;
	}

	
	
}
