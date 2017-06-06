package chapter26;

public class NiInterpreter implements Interpreter
{
    public void parse(Context context)
    {
        if (context.getStr().indexOf("你") != -1)
        {
            System.out.println("You");
        }
    }
}
