package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		
		this.grossSalary += (percentage * this.grossSalary) / 100;
	}
	
	public String toString() {
		
		return this.name+ ", $" + netSalary();
		
	}
}

