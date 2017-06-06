package chapter21;

public class Client
{
    public static void main(String[] args)
    {
        Chef chef = new Chef();
        Command command = new CookCommand(chef);
        Consumer consumer = new Consumer();
        consumer.addCommand(command);
        consumer.orderDishes();
    }
}
