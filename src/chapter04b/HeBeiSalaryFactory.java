package chapter04b;

public class HeBeiSalaryFactory implements Factory
{
    public Salary createSalary()
    {
        return new HeBeiSalary();
    }
}
