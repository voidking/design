package chapter05b;


public class HeBeiFactory implements Factory1
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
