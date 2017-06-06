package chapter19b;

public class Client
{
    public static void main(String[] args)
    {
        /*SalaryTemplate salaryTemplate = new SalaryTemplate();
        salaryTemplate.setSalary(new HeBeiSalary());
        salaryTemplate.setInsurance(new HeBeiInsurance());
        salaryTemplate.setTax(new HeBeiTax());
        salaryTemplate.compute();*/

        SalaryTemplate salaryTemplate = new SalaryTemplate();
        salaryTemplate.setSalary(new JiLinSalary());
        salaryTemplate.setInsurance(new JiLinInsurance());
        salaryTemplate.setTax(new JiLinTax());
        salaryTemplate.compute();
    }
}
