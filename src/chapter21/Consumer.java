package chapter21;

import java.util.ArrayList;
import java.util.List;

public class Consumer
{
    /*public void orderDishes()
    {
        Chef chef = new Chef();
        chef.cook();
    }*/

    private List list = new ArrayList();

    public void orderDishes()
    {
        for (int i = 0; i < list.size(); i++)
        {
            Command command = (Command) list.get(i);
            command.execute();
        }
    }

    public void addCommand(Command command)
    {
        list.add(command);
    }
}
