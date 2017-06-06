package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Facade
{
    public List getEmpByOrgan(String orgId)
    {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        return list;
    }
}
