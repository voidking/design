package chapter21a;

import java.util.ArrayList;
import java.util.List;

public class Coach
{
    private List list = new ArrayList();

    private CommandNew attackCommand;
    private CommandNew defenseCommand;

    public Coach(CommandNew attackCommand, CommandNew defenseCommand)
    {
        this.attackCommand = attackCommand;
        this.defenseCommand = defenseCommand;
    }

    public void attack()
    {
        attackCommand.execute();
        list.add(attackCommand);
    }

    public void defense()
    {
        defenseCommand.execute();
        list.add(defenseCommand);
    }

    public void rebroadcast()
    {
        for (int i = 0; i < list.size(); i++)
        {
            CommandNew commandNew = (CommandNew) list.get(i);
            commandNew.execute();
        }
    }
}
