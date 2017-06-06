package chapter22;

public class Television
{
    private int count;

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    private float price;

    public double accountByPrice()
    {
        System.out.println("电视按台计价，购买的数量为：" + getCount() + "台，购买的单价为："+ getPrice() + "，总价为：" + getCount() * getPrice());
        return getCount() * getPrice();
    }
}
