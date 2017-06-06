package chapter19b;

public class SalaryTemplate
{
    private Salary salary;
    private Insurance insurance;
    private Tax tax;

    public void compute()
    {
        salary.computeSalary();
        insurance.computeInsurance();
        tax.computeTax();
    }

    public Salary getSalary()
    {
        return salary;
    }

    public void setSalary(Salary salary)
    {
        this.salary = salary;
    }

    public Insurance getInsurance()
    {
        return insurance;
    }

    public void setInsurance(Insurance insurance)
    {
        this.insurance = insurance;
    }

    public Tax getTax()
    {
        return tax;
    }

    public void setTax(Tax tax)
    {
        this.tax = tax;
    }
}
