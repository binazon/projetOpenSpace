package fr.binazon.openSpace;
import java.util.List;
public class Facade {
	private PosteTravail posteTravail1;
	private PosteTravail posteTravail2;
	private Materiel materiel1;
	private Materiel materiel2;
	private Employee employee;
	private Employee_PosteTravail employee_Poste;
	public List<Employee> FacadeCree(String file, int numero1, int numero2 ){
		posteTravail1.numeroEmplace = numero1;
		posteTravail2.numeroEmplace = numero2;
		posteTravail1.materiels.add(materiel1);
		posteTravail1.materiels.add(materiel2);
		employee_Poste.relation(employee, posteTravail1);
		return null;
	}
}
