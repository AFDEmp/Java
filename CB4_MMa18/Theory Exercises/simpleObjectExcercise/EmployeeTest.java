import java.util.Scanner;

public class EmployeeTest {
	static Scanner scanner = new Scanner (System.in);
	static Employee[] employeeArray = new Employee[10];//rray that stores Employees	
	public static void main (String args[]){
		createMenu();
	}

	private static void createMenu() {

		int choice=0;

		do{	
			System.out.println("\n    **Menu**    ");
			System.out.println("1. Print Employees");
			System.out.println("2. Create new Employee");
			System.out.println("3. Give raise");			
			System.out.print("Make your choice: ");
			choice = scanner.nextInt();	
			System.out.println("");

			if(choice==1){
				printEmployees();
			}
			else if(choice==2){
				createNewEmployee();
			}
			else if(choice==3){
				giveRaise();
			}			
		}
		while(choice!=-1||Employee.getCountEmployeeObjects()>=employeeArray.length);
	}

	private static void printEmployees() {
		System.out.println(" Print Employees");
		boolean found=false; 
		for(Employee empl:employeeArray){
			if(empl!=null){//why???
				System.out.println(empl);
				found = true;//becomes true if there is even one object stored
			}
		}
		if (!found){
			System.out.println("Employees not found");
		}
	}
	private static void createNewEmployee() {
		System.out.println(" Create new Employee");
		System.out.print("Employee's name: ");
		scanner.nextLine();// !don't pay attention to this line!
		String name = scanner.nextLine();
		System.out.print("Employee's salary: ");
		double salary = scanner.nextDouble();	
		
		//the new object is stored in the next position of the array
		employeeArray[Employee.getCountEmployeeObjects()] = new Employee(name, salary);// What is stored in index[0]?????

	}
	private static void giveRaise() {
		System.out.println(" Give raise, insert id");
		int id = scanner.nextInt();	
		boolean found = false;
		for(int i=0; i<employeeArray.length; i++){
			if(employeeArray[i]!=null){//why???
				if(employeeArray[i].getEmployee_id()==id){
					System.out.print("Raise:");
					double raise = scanner.nextDouble();
					employeeArray[i].setSalary(employeeArray[i].getSalary()+raise);
					found = true;
					break;
				}
			}
		}
		if(!found){
			System.out.println("Id not found");
		}		
	}
}
