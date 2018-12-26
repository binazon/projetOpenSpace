package fr.binazon.openSpace;

public class Pc extends Materiel {
	protected String marque;
	protected int vitesse;
	protected int capRAM;
	protected int capDD;
	protected int capSSD;
	protected String OS;
	protected String adrMAC;
	protected String adrIP;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getCapRAM() {
		return capRAM;
	}
	public void setCapRAM(int capRAM) {
		this.capRAM = capRAM;
	}
	public int getCapDD() {
		return capDD;
	}
	public void setCapDD(int capDD) {
		this.capDD = capDD;
	}
	public int getCapSSD() {
		return capSSD;
	}
	public void setCapSSD(int capSSD) {
		this.capSSD = capSSD;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getAdrMAC() {
		return adrMAC;
	}
	public void setAdrMAC(String adrMAC) {
		this.adrMAC = adrMAC;
	}
	public String getAdrIP() {
		return adrIP;
	}
	public void setAdrIP(String adrIP) {
		this.adrIP = adrIP;
	}	
}