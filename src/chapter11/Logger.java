package chapter11;
public class Logger
{
    public static Logger getLogger(String name)
    {
        return new Logger();
    }

    public static void log(String logMessage)
    {
        System.out.println(logMessage);
    }
}
