package chapter25;

import java.util.*;
import java.util.Iterator;

public class Client
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator iter = list.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

        Map map = new HashMap();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
