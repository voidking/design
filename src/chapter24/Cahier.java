package chapter24;

public class Cahier
{
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getPersons()
    {
        return persons;
    }

    public void setPersons(String persons)
    {
        this.persons = persons;
    }

    private String name;
    private String content;
    private String persons;

    public Memento getMemento()
    {
        return new Memento(this);
    }

    public void setMemento(Memento memento)
    {
        name = memento.getName();
        content = memento.getContent();
        persons = memento.getPersons();
    }
}
