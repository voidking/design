package chapter01;



public class SampleFactory
{
    public static Salary CreateSalary(String name)
    {
        Class c;
        Salary salary = null;
		try {
			c = Class.forName(name);
			salary = (Salary)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}       
        return salary;
    }
}
