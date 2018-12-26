package fr.binazon.openSpace;

public class Employee_PosteTravail {
	protected Employee employee;
	protected PosteTravail posteTravail;
	public void relation(Employee employee, PosteTravail posteTravail){
		this.employee=employee;
		this.posteTravail=posteTravail;
	}
}