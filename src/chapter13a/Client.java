package chapter13a;

public class Client
{
    public static void main(String[] args)
    {
        Car car = new Truck(new Faw());
        car.produce();

        System.out.println("**********");

        car = new Truck(new Dfmc());
        car.produce();

        System.out.println("**********");

        car = new Bus(new Faw());
        car.produce();

        System.out.println("**********");

        car = new Bus(new Dfmc());
        car.produce();
    }
}
