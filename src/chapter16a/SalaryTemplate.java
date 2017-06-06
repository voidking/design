package chapter16a;

public abstract class SalaryTemplate
{
    public void compute()
    {
        computeSalary();
        computeInsurance();
        computeTax();
    }

    public abstract void computeSalary();

    public abstract void computeInsurance();

    public abstract void computeTax();
}
