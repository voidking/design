package chapter22a;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    public List getList()
    {
        return list;
    }

    private List list = new ArrayList();

    public void add(Object object)
    {
        list.add(object);
    }

    public void remove(Object object)
    {
        list.remove(object);
    }
}
