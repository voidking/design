package chapter21a;

public class AttackCommand extends CommandNew
{
    public void execute()
    {
        super.getAthlete().attack();
    }
}
