package chapter17a;

public class Client
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.add(new PhoneClient());
        stock.add(new ComputerClient());
        stock.changePrice();
        stock.changeCount();
    }
}
