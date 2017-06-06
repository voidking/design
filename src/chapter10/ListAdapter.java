package chapter10;

import java.util.HashMap;
import java.util.List;

public class ListAdapter extends HashMap
{
    private List list;

    public ListAdapter(List list)
    {
        this.list = list;
    }

    public int size()
    {
        return list.size();
    }

    public Object get(Object i)
    {
        return list.get((Integer.valueOf(i.toString())).intValue());
    }
}
