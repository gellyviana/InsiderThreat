package WayTree;

import br.imd.factory.Http;

public class PrintTree {
	
	Arvore arvore = new Arvore();
	
	public void oi(){
		for(Http http: arvore.getHttpHist().getHttpRegs()){
			System.out.println();
		}
	}
}
