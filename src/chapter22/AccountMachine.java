package chapter22;

import java.util.Iterator;
import java.util.List;

public class AccountMachine
{
    public double getAmt()
    {
        return amt;
    }

    private double amt;

    public void account(List list)
    {
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object object = iterator.next();
            if (object instanceof Wine)
            {
                amt += ((Wine) object).accountByBottle();
            } else if (object instanceof Pig)
            {
                amt += ((Pig) object).accountByUnit();
            } else if (object instanceof Television)
            {
                amt += ((Television) object).accountByPrice();
            } else
            {
                System.out.println("其他物品");
            }
        }
    }
}
