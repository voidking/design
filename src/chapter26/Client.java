package chapter26;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    public static void main(String[] args)
    {
        Context context = new Context("我  爱  你");
        List list = new ArrayList();
        list.add(new WoInterpreter());
        list.add(new FuhaoInterpreter());
        list.add(new AiInterpreter());
        list.add(new FuhaoInterpreter());
        list.add(new NiInterpreter());
        for (int i = 0; i < list.size(); i++)
        {
            Interpreter interpreter = (Interpreter) list.get(i);
            interpreter.parse(context);
        }
    }
}
