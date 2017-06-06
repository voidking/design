package chapter17a;

public class ComputerClient implements StockObserver
{
    public void updatePrice(String name)
    {
        System.out.println(name + "股票在电脑上的价格更新了");
    }

    public void updateCount(String name)
    {
        System.out.println(name + "股票在电脑上的买卖数量更新了");
    }
}
