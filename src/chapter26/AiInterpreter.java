package chapter26;

public class AiInterpreter implements Interpreter
{
    public void parse(Context context)
    {
        if (context.getStr().indexOf("爱") != -1)
        {
            System.out.println("Love");
        }
    }
}
