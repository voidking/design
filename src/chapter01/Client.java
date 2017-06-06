package chapter01;


public class Client
{
    public void computerSalary(String name)
    {
        Salary salary = SampleFactory.CreateSalary(name);
        salary.computerSalary();
    }
}
