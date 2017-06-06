package chapter22a;

public class PigNew implements Goods
{
    public float getCount()
    {
        return count;
    }

    public void setCount(float count)
    {
        this.count = count;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    private float count;
    private float price;

    public double accountByUnit()
    {
    	System.out.println("猪肉按斤计价，购买的数量为：" + getCount() + "斤，购买的单价为：" + getPrice() + "，总价为：" + getCount() * getPrice());
        return getCount() * getPrice();
    }

    public double accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}
