package chapter06b;


public class Client
{
    public static void main(String args[])
    {
        Director director = new Director(new HeBeiFactory());
        director.computer();
        director = new Director(new JiLinFactory());
        director.computer();
    }
}
