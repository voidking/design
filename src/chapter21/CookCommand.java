package chapter21;

public class CookCommand implements Command
{
    public CookCommand(Chef chef)
    {
        this.chef = chef;
    }

    private Chef chef;

    public void execute()
    {
        chef.cook();
    }
}
