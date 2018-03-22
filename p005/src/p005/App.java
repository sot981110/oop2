package p005;

import java.util.Random;

import p006.Employee;

public class App {

	public static void main(String[] args) {
		Employee vedres = new Employee("Vedres Dávid", 0);
		Employee akos = new Employee("Rublinszki Ákos", 10);
		
		vedres.raiseSalary(100);
		vedres.printDetails();
		akos.setSalary(1000);
		akos.printDetails();
		if(akos.isHigherSalary(vedres)){
			System.out.println("Ákosnak több a fizetése.");
		}
		else if(vedres.isHigherSalary(akos)){
			System.out.println("Dávidnak több a fizetése.");
		}
		else{
			System.out.println("Ákosnak és Dávidnak ugyanannyi a fizetése.");
		}
		
		Employee[] employeearray = new Employee[5];
		for (int i = 0; i < employeearray.length; i++) {
			employeearray[i].setName("Employee " + (i+1));
			employeearray[i].setSalary((new Random().nextInt() % 90000) + 10000);
		}
		
		for (int i = 0; i < employeearray.length; i++) {
			employeearray[i].printDetails();
		}

	}

}
