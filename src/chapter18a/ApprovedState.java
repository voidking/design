package chapter18a;

public class ApprovedState implements State
{
    public void handle(DocumentState documentState)
    {
        System.out.println("公文已结束");
    }
}
