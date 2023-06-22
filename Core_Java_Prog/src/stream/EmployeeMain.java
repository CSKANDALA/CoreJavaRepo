package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee emp1 = new Employee(2, "mani", 25000);
		Employee emp2 = new Employee(1, "kesava", 20000);
		Employee emp3 = new Employee(3, "kesava", 20000);

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);

		
		//employeeList.stream().filter(emp->emp.getSalary()>20000).forEach(emp->System.out.println(emp.getId()));
		/*employeeList.forEach(emp -> System.out.println(emp.getName()));
		System.out.println();

		employeeList.stream().filter(emp -> emp.getSalary() > 21000).forEach(emp -> System.out.println(emp.getName()));
		System.out.println();

		List<Employee> empList = employeeList.stream().filter(emp -> emp.getSalary() > 21000)
				.collect(Collectors.toList());
		System.out.println(empList);
		System.out.println();*/
		
		/*List<String> listOfEmpNames=employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		listOfEmpNames.forEach(s->System.out.println(s));*/
		
		/*List<String> listOfEmpNameByFilter=employeeList.stream().filter(emp->emp.getSalary()>21000).map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println(listOfEmpNameByFilter);*/
		
		employeeList.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(emp -> System.out.println(emp.getId()));
		employeeList.stream().sorted(Comparator.comparingInt(emp -> ((Employee) emp).getId()).reversed()).forEach(emp -> System.out.println(emp.getId()));
		System.out.println();
		
		String empName=employeeList.stream().sorted(Comparator.comparing(Employee::getName)).findFirst().get().getName();
		//System.out.println("empName : "+empName);
							
		/*Function<Employee, List<Object>> compositeKey = emp -> Arrays.asList(emp.getName(), emp.getSalary());
		System.out.println("compositeKey : " + compositeKey);
		Map<Object, List<Employee>> data = employeeList.stream().collect(
				Collectors.groupingBy(emp -> Arrays.asList(emp.getName(), emp.getSalary()), Collectors.toList()));
		System.out.println(data);*/
		
	}
}
