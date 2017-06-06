package chapter03b;

public class Client {

	public static void main(String[] args) {
		
		Salary salary = SampleFactory.createSalary("HeBei");
		salary.computerSalary();
		
		salary = SampleFactory.createSalary("JiLin");
		salary.computerSalary();

	}

}
