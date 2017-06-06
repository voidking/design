package chapter21a;

public class DefenseCommand extends CommandNew
{
    public void execute()
    {
        super.getAthlete().defense();
    }
}
