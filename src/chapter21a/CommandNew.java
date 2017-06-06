package chapter21a;

public abstract class CommandNew
{
    public Athlete getAthlete()
    {
        return athlete;
    }

    public void setAthlete(Athlete athlete)
    {
        this.athlete = athlete;
    }

    private Athlete athlete;

    public abstract void execute();
}
