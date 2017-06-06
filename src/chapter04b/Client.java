package chapter04b;

public class Client
{
    public static void main(String args[])
    {
        Factory factory = new HeBeiSalaryFactory();
        Salary salary = factory.createSalary();
        salary.computerSalary();
        factory = new JiLinSalaryFactory();
        salary = factory.createSalary();
        salary.computerSalary();
    }
}
