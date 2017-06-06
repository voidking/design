package chapter22a;

public interface Visitor
{
    double visit(WineNew wine);

    double visit(PigNew pig);

    double visit(TelevisionNew television);
}