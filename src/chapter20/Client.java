package chapter20;

public class Client
{
    public static void main(String[] args)
    {
        XiaoGongNew xiaoGongNew = new XiaoGongNew();
        Doctor nerveDoctor = new NerveDoctor();
        Doctor sleepDoctor = new SleepDoctor();
        Doctor assimilationDoctor = new AssimilationDoctor();
        nerveDoctor.setDoctor(sleepDoctor);
        sleepDoctor.setDoctor(assimilationDoctor);
        xiaoGongNew.setHead(false);
        xiaoGongNew.setSleep(false);
        xiaoGongNew.setStomach(true);
        nerveDoctor.seeDoctor(xiaoGongNew);
    }
}
