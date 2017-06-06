package chapter04b;

public class JiLinSalaryFactory implements Factory
{
    public Salary createSalary()
    {
        return new JiLinSalary();
    }
}
