package chapter22;

public class Wine
{
    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    private int count;

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    private float price;

    public double accountByBottle()
    {
        System.out.println("酒按瓶计价，购买的数量为：" + getCount() + "瓶，购买的单价为：" + getPrice() + "，总价为：" + getCount() * getPrice());
        return getCount() * getPrice();
    }
}
