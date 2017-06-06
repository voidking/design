package chapter19;

public abstract class SalaryTemplate
{
    public void Compute()
    {
        computeSalary();
        computeInsurance();
        computeTax();
    }

    public abstract void computeSalary();

    public abstract void computeInsurance();

    public abstract void computeTax();
}
