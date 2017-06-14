package WayTree;

import java.util.ArrayList;

import br.imd.factory.Http;

public class HttpHist {

	private ArrayList<Http> httpRegs;
	
	public HttpHist(){
		httpRegs = new ArrayList<Http>();
	}

	public ArrayList<Http> getHttpRegs() {
		return httpRegs;
	}

	public void setHttpRegs(ArrayList<Http> httpRegs) {
		this.httpRegs = httpRegs;
	}
	
	
}
