package chapter26;

public class FuhaoInterpreter implements Interpreter
{
    public void parse(Context context)
    {
        if (context.getStr().indexOf(" ") != -1)
        {
            System.out.println(" ");
        }
    }
}
