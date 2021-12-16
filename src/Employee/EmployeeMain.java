package Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	//methods
	
	public static List<Employee> getEmployeesBySalarySort(ArrayList<Employee> arrli)
	{		
		return arrli.stream().sorted((o1,o2)->((int)o1.getSalary()-(int)o2.getSalary())).collect(Collectors.toList());		
	}
	
	public static int countEmployeesSalaryOfGivenRange(double minRange,double maxRange, List<Employee> arrli)
	{		
		return (int) arrli.stream().filter(o->o.getSalary()>minRange && o.getSalary()<maxRange).count();		
	}
	
	//driver code
	public static void main(String[] args) {
		
		ArrayList<Employee> arrli = new ArrayList<>();
		
		Employee e1 = new Employee(101, "Aravi", 45000.25);
		Employee e2 = new Employee(103, "Bravo", 25000.25);
		Employee e3 = new Employee(105, "Charlie", 35000.25);
		Employee e4 = new Employee(102, "Delta", 16000.25);
		Employee e5 = new Employee(104, "Echo", 57000.25);
		Employee e6 = new Employee(106, "Foxtrot", 68000.25);
		
		arrli.add(e1);
		arrli.add(e2);
		arrli.add(e3);
		arrli.add(e4);
		arrli.add(e5);
		arrli.add(e6);		

	
		System.out.println("Employee with Lowest Salary first: "+getEmployeesBySalarySort(arrli)+"\n");
		
		System.out.println("Number of Employees in the specified Salary range: "+countEmployeesSalaryOfGivenRange(45000,60000,arrli)+"\n");	
		
		System.out.println("All employees: " + arrli);
	}

}
