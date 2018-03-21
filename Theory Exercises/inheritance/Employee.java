public class Employee {
	public String name;

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calculateSalary() {
		return 500;
	}
	public Employee(String name) {
		this.name = name;
	}
}
