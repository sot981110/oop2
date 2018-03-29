package p006;

import java.time.LocalDate;

public class Employee {
	private String name;
	private Integer salary;
	private Integer age;
	LocalDate birthday;
	
	private static Integer retirementAge = 65;
	
	//Constructors
	public Employee(String name, Integer salary, LocalDate birthday){
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
		this.age = LocalDate.now().getYear() - birthday.getYear();
	}
	
	public Employee(String name, Integer salary, Integer age){
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.birthday = LocalDate.of(LocalDate.now().getYear() - this.age, 1, 1);
	}
	
	public Employee(String name, Integer age){
		this.name = name;
		this.age = age;
		this.salary = 10000*age;
	}
	
	//Getters
	public String getName(){
		return this.name;
	}
	
	public Integer getSalary(){
		return this. salary;
	}
	
	public Integer getAge(){
		return this.age;
	}
	
	public static Integer getRetirementAge() {
		return retirementAge;
	}
	
	//Setters
	public void setName(String name){
		this.name = name;
		return;
	}
	
	public void setSalary(Integer salary){
		this.salary = salary;
		return;
	}
	
	public void setAge(Integer age){
		this.age = age;
		return;
	}
	
	public static void setRetirementAge(Integer retirementAge) {
		Employee.retirementAge = retirementAge;
	}

	//Methods
	public void raiseSalary(Integer raise){
		this.salary += raise;
	}
	
	public void printDetails(){
		System.out.println("Employee:");
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
	
	public boolean isBetweenSalary(Integer lower, Integer higher){
		if(lower > higher){
			return false;
		}
		else if(lower == higher || this.salary == lower){
			return true;
		}
		else if(lower <= this.salary || this.equals(salary <= higher)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Integer yearsUntilRetirement(){
		return Employee.retirementAge-this.age;
	}
	
	public boolean isHigherSalary(Employee e2){
		if(this.salary > e2.getSalary()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return this.name + ": " + this.age + " " + this.birthday.getMonth().name() + " " + this.birthday.getDayOfMonth() + " " + this.yearsUntilRetirement() + " " + this.salary;
	}
	
	public static Employee hasMoreYearsUntilRetirement(Employee employee1, Employee employee2){
		if(employee1.yearsUntilRetirement() > employee2.yearsUntilRetirement()){
			return employee1;
		}
		else if(employee1.yearsUntilRetirement() < employee2.yearsUntilRetirement()){
			return employee2;
		}
		else{
			return null;
		}
	}
	
}
