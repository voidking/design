package chapter21a;

public class Client
{
    public static void main(String[] args)
    {

        Athlete athlete = new Athlete();
        AttackCommand attackCommand = new AttackCommand();
        attackCommand.setAthlete(athlete);
        DefenseCommand defenseCommand = new DefenseCommand();
        defenseCommand.setAthlete(athlete);
        Coach coach = new Coach(attackCommand, defenseCommand);
        coach.attack();
        coach.defense();
        coach.attack();
        coach.defense();
        coach.defense();
        System.out.println("回放教练发出的命令");
        coach.rebroadcast();
    }
}
