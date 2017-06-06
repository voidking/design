package chapter19;

public class HeBeiSalaryTemplate extends SalaryTemplate
{
    public void computeSalary()
    {
        System.out.println("采用河北算法计算基本工资");
    }

    public void computeInsurance()
    {
        System.out.println("采用河北算法计算保险");
    }

    public void computeTax()
    {
        System.out.println("采用河北算法计算所得税");
    }
}
