package p006;

public class Employee {
	private String name;
	private Integer salary;
	private Integer age;
	
	public Employee(String name, Integer salary, Integer age){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Integer getSalary(){
		return this. salary;
	}
	
	public Integer getAge(){
		return this.age;
	}
	
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
	
	public boolean isHigherSalary(Employee e2){
		if(this.salary > e2.getSalary()){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
}
