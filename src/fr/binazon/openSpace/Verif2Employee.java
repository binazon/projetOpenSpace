package fr.binazon.openSpace;
public class Verif2Employee {
	public boolean verification(Employee_PosteTravail employee_Poste1, Employee_PosteTravail employee_Poste2){
		return employee_Poste1.posteTravail.equals(employee_Poste2.posteTravail) && 
				!employee_Poste1.employee.equals(employee_Poste2.employee);
	}
}