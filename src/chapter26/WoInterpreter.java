package chapter26;

public class WoInterpreter implements Interpreter
{
    public void parse(Context context)
    {
        if (context.getStr().indexOf("我") != -1)
        {
            System.out.println("I");
        }
    }
}
