package chapter06;


public class Client
{
    public static void main(String args[])
    {
        Director director = new Director(new MotorcycleFactory());
        Motorcycle motorcycle = director.assembleMotorcycle();
    }
}
