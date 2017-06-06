package chapter22a;

public class VisitorImpl implements Visitor
{
    public double visit(WineNew wine)
    {
        return wine.accountByBottle();
    }

    public double visit(PigNew pig)
    {
        return pig.accountByUnit();
    }

    public double visit(TelevisionNew television)
    {
        return television.accountByPrice();
    }
}
