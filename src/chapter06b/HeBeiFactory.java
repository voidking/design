package chapter06b;

public class HeBeiFactory implements Factory
{
    public Salary createSalary()
    {
        return new HeBeiSalary();
    }
    
    public Insurance createInsurance()
    {
        return new HeBeiInsurance();
    }

    public Tax createTax()
    {
        return new HeBeiTax();
    }
}
