package chapter20;

public class AssimilationDoctor extends Doctor
{
    public void seeDoctor(XiaoGongNew xiaoGongNew)
    {
        if (xiaoGongNew.isStomach())
        {
            System.out.println("消化科的医生看病");
        } else if (super.getDoctor() != null)
        {
            super.getDoctor().seeDoctor(xiaoGongNew);
        }
    }
}
