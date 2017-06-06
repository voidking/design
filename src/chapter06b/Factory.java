package chapter06b;

public interface Factory
{
    Salary createSalary();
    Insurance createInsurance();
    Tax createTax();
}