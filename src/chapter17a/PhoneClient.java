package chapter17a;

public class PhoneClient implements StockObserver
{
    public void updatePrice(String name)
    {
        System.out.println(name + "股票在手机上的价格更新了");
    }

    public void updateCount(String name)
    {
        System.out.println(name + "股票在手机上的买卖数量更新了");
    }
}
