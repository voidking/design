package chapter16a;

public class JiLinSalaryTemplate extends SalaryTemplate
{
    public void computeSalary()
    {
        System.out.println("采用吉林算法计算基本工资");
    }

    public void computeInsurance()
    {
        System.out.println("采用吉林算法计算保险");
    }

    public void computeTax()
    {
        System.out.println("采用吉林算法计算所得税");
    }
}