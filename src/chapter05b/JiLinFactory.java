package chapter05b;



public class JiLinFactory implements Factory1
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
