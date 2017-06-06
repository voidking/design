package chapter20;

public class SleepDoctor extends Doctor
{
    public void seeDoctor(XiaoGongNew xiaoGongNew)
    {
        if (xiaoGongNew.isSleep())
        {
            System.out.println("睡眠中心的医生看病");
        } else if (super.getDoctor() != null)
        {
            super.getDoctor().seeDoctor(xiaoGongNew);
        }
    }
}
