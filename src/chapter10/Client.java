package chapter10;

public class Client
{
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        ListAdapter listAdapter = new ListAdapter(facade.getEmpByOrgan("1"));
        Application.execute(listAdapter);
    }
}
