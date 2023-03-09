package model;

import java.U
til.Comparator;

public class CompAuMu implements Comparator <Agrupaciones>{

	

	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {
		int comp;
		comp = o1.getAutorMusica().compareTo(o2.getAutorMusica());
		return comp;
	}
	
	
}
