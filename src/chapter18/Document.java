package chapter18;

public class Document
{
    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    private String state;

    public void handle()
    {
        if ("创建中".equals(state))
        {
            state = "创建完成";
            System.out.println("公文已" + state);
        } else if ("创建完成".equals(state))
        {
            state = "发送二级主管";
            System.out.println("公文已" + state);
        } else if ("发送二级主管".equals(state))
        {
            state = "发送一级主管";
            System.out.println("公文已" + state);
        } else if ("发送一级主管".equals(state))
        {
            state = "审批完成";
            System.out.println("公文已" + state);
        } else if ("审批完成".equals(state))
        {
            System.out.println("公文已结束");
        }
    }
}
