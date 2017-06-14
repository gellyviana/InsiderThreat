package WayTree;

import br.imd.factory.User;

public class Arvore {

	private User user;
	private DeviceHist deviceHist;
	private LogonHist logonHist;
	private HttpHist httpHist;
	
	public Arvore(){
		deviceHist = new DeviceHist();
		logonHist = new LogonHist();
		httpHist = new HttpHist();
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public DeviceHist getDeviceHist() {
		return deviceHist;
	}
	
	public void setDeviceHist(DeviceHist deviceHist) {
		this.deviceHist = deviceHist;
	}
	
	public LogonHist getLogonHist() {
		return logonHist;
	}
	
	public void setLogonHist(LogonHist logonHist) {
		this.logonHist = logonHist;
	}
	
	public HttpHist getHttpHist() {
		return httpHist;
	}
	
	public void setHttpHist(HttpHist httpHist) {
		this.httpHist = httpHist;
	}
	
	
	
}
