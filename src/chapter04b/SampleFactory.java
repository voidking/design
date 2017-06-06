package chapter04b;

public class SampleFactory
{
    public static Salary createSalary(String name)
    {
        if ("HeBei".equals(name))
        {
            return new HeBeiSalary();
        }
        else if ("JiLin".equals(name))
        {
            return new JiLinSalary();
        }
        return null;
    }
}
