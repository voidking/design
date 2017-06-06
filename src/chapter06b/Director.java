package chapter06b;


public class Director
{
    private Factory factory;

    public Director(Factory factory)
    {
        this.factory = factory;
    }

    public void computer()
    {
        Salary salary = factory.createSalary();
        salary.computerSalary();
        Insurance insurance = factory.createInsurance();
        insurance.computerInsurance();
        Tax tax = factory.createTax();
        tax.computerTax();
    }
}
