package fr.binazon.openSpace;
public class FactoryMateriel {
	private Materiel materiel = new Materiel();
	private Pc pc;
	private Ecran ecran;
	private Telephone telephone;
	private enum enumeration{
		Pc,
		Ecran,
		Telephone
	}
	public Materiel fabriqueMateriel(enumeration uneEnumeration, String marque, int vitesse, 
									String OS, int capRAM, int capDD, 
									int capSSD, double nbPouce, int numero) {
		switch(uneEnumeration){
			case Pc :{
				pc.setMarque(marque);
				pc.setVitesse(vitesse);
				pc.setOS(OS);
				pc.setCapRAM(capRAM);
				pc.setCapDD(capDD);
				pc.setCapSSD(capSSD);
				materiel =pc;
				break;
			}
			case Ecran :{
				ecran.setNbPouce(nbPouce);
				materiel = ecran;
				break;
			}
			default :{
				telephone.setNumero(numero);
				materiel =telephone;
				break;
			}
		}
		return materiel;
	}
}
