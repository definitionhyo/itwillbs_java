package polymorphism_0403;

public class Ex2 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		System.out.println("----------------");
		
		Manager man = new Manager("이순신", 4000, "개발팀", 3);
		System.out.println("Employee 정보 : " + man.getEmployee());
		man.salaryCalculation();
		System.out.println("----------------");
		
		Engineer eng = new Engineer("전우치", 5000, 5);
		System.out.println("Employee 정보 : " + eng.getEmployee());
		eng.salaryCalculation();
		System.out.println("----------------------");
		
		Employee emp2 = new Manager("업스트링", 4000, "개발", 3);
		emp2.salaryCalculation();
	}

}

class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name + ", " + salary;
	}
	
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary);
	}
	
	
	
	
	
}

class Manager extends Employee {
	String depart;
	int manageEmployeeCount;
	
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	public String getManager() {
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount;
	}
	
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (manageEmployeeCount * 10);
		System.out.println("연봉 : " + salaryResult);
	}
	
}

class Engineer extends Employee {
	int numOfCertificate;

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개"; 
	}
	
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (numOfCertificate * 20);
		System.out.println("연봉 : " + salaryResult);
	}
	
}










