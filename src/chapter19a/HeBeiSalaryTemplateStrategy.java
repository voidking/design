package chapter19a;

public class HeBeiSalaryTemplateStrategy extends SalaryTemplate
{
    /*Salary salary = new Salary();
    Insurance insurance = new Insurance();
    Tax tax = new Tax();

    public void computeSalary()
    {
        salary.computeHeBeiSalary();
    }

    public void computeInsurance()
    {
        insurance.computeHeBeiInsurance();
    }

    public void computeTax()
    {
        tax.computeHeBeiTax();
    }*/

    HeBeiSalary salary = new HeBeiSalary();
    HeBeiInsurance insurance = new HeBeiInsurance();
    HeBeiTax tax = new HeBeiTax();

    public void computeSalary()
    {
        salary.computeSalary();
    }

    public void computeInsurance()
    {
        insurance.computeInsurance();
    }

    public void computeTax()
    {
        tax.computeTax();
    }
}
