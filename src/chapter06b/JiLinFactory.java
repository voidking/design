package chapter06b;

public class JiLinFactory implements Factory
{
    public Salary createSalary()
    {
        return new JiLinSalary();
    }

    public Insurance createInsurance()
    {
        return new JiLinInsurance();
    }

    public Tax createTax()
    {
        return new JiLinTax();
    }
}
