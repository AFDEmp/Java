public class HPaidEmployee extends Employee {
	private int hours;
	private double rate;
	private String name;

	public HPaidEmployee(String name, int hours, double rate) {
		super(name);
		this.hours= hours;
		this.rate= rate;
	}


	@Override
	public double calculateSalary() {
		return super.calculateSalary()+hours*rate;
	}

	@Override
	public String toString() {
		//System.out.println(name);
		//System.out.println(super.name);
		return "HPaidEmployee [hours=" + hours + ", rate=" + rate +
		" salary="+ this.calculateSalary()+ " "+super.toString();
	}



}

