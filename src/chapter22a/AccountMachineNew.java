package chapter22a;

import java.util.List;

public class AccountMachineNew
{
    public double getAmt()
    {
        return amt;
    }

    private double amt;

    public void account(List list)
    {
        Visitor visitor = new VisitorImpl();
        for (int i = 0; i < list.size(); i++)
        {
            amt += ((Goods) list.get(i)).accept(visitor);
        }
    }
}
