package Employee;
/*
1. Create an Employee class with variables name, employee id, salary
	Create a main method within the class
	Create two employees
	Print both the employees
	*/

public class MyClass {
	
	public static void main(String args[]){
		
		Employee emp= new Employee();//object
		
		emp.setName("rohit");
		System.out.println(emp.getName());
		 
		emp.setId(1265);
		System.out.println(emp.getId());
		
		emp.setSalary(2500.25);
		System.out.println(emp.getSalary());
		
		
		Employee emp1= new Employee();
		
		emp1.setName("rahul");
		System.out.println(emp1.getName());
		
		emp1.setId(65);
		System.out.println(emp1.getId());
		
		emp1.setSalary(30000.12);
		System.out.println(emp1.getSalary());
		
		
		
		
		
		
		
		
		
	}

}
