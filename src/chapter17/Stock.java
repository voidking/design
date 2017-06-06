package chapter17;

public class Stock
{
    private String stockName = "中信证券";

    public void changeCount()
    {
        PhoneClient phoneClient = new PhoneClient();
        phoneClient.updateCount(stockName);
        ComputerClient computerClient = new ComputerClient();
        computerClient.updateCount(stockName);
    }

    public void changePrice()
    {
        PhoneClient phoneClient = new PhoneClient();
        phoneClient.updatePrice(stockName);
        ComputerClient computerClient = new ComputerClient();
        computerClient.updatePrice(stockName);
    }
}
