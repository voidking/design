package chapter19a;

public class JiLinSalaryTemplateStrategy extends SalaryTemplate
{
    /*Salary salary = new Salary();
    Insurance insurance = new Insurance();
    Tax tax = new Tax();

    public void computeSalary()
    {
        salary.computeJiLinSalary();
    }

    public void computeInsurance()
    {
        insurance.computeJiLinInsurance();
    }

    public void computeTax()
    {
        tax.computeJiLinTax();
    }*/

    JiLinSalary salary = new JiLinSalary();
    JiLinInsurance insurance = new JiLinInsurance();
    JiLinTax tax = new JiLinTax();

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
