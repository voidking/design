package chapter16a;

public class Client
{
    public static void main(String[] args)
    {

        SalaryTemplate salaryTemplate = new JiLinSalaryTemplate();
        salaryTemplate.compute();

        System.out.println("**********");

        salaryTemplate = new HeBeiSalaryTemplate();
        salaryTemplate.compute();
    }
}