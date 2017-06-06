package chapter05b;


public class Client1
{
    public static void main(String args[])
    {
        Factory1 factory1 = new HeBeiFactory();
        Salary salary = factory1.createSalary();
        salary.computerSalary();
        Insurance insurance = factory1.createInsurance();
        insurance.computerInsurance();
        Tax tax = factory1.createTax();
        tax.computerTax();

        factory1 = new JiLinFactory();
        salary = factory1.createSalary();
        salary.computerSalary();
        insurance = factory1.createInsurance();
        insurance.computerInsurance();
        tax = factory1.createTax();
        tax.computerTax();
    }
}
