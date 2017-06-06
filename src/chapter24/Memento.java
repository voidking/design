package chapter24;

public class Memento
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

    public Memento(Cahier cahier)
    {
        this.name = cahier.getName();
        this.content = cahier.getContent();
        this.persons = cahier.getPersons();
    }

}
