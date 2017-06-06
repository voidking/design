package chapter18a;

public class SendSuperChargeState implements State
{
    public void handle(DocumentState documentState)
    {
        documentState.setState(new ApprovedState());
        System.out.println("公文已审批完成");
    }
}
