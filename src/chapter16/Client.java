package chapter16;

public class Client
{
    public static void main(String[] args)
    {
        Report report = new ReportImpl();
        report.print();

        System.out.println("**********");

        report = new ReportImpl1();
        report.print();

    }
}