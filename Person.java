
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person
{
    private String forename;
    private String surname;
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        forename = null;
        surname = null;
        age = 0;

    }

    public Person(String forename, String surname, int age)
    {
        setForename(forename);
        setSurname(surname);
        setAge(age);
    }

    public void setForename(String newForename)
    {
        forename = newForename;
    }

    public String getForename()
    {
        return forename;
    }

    public void setSurname(String newSurname)
    {
        surname = newSurname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public int getAge()
    {
        return age;
    }

    public void display()
    {
        System.out.println("Forename: " + forename);
        System.out.println("Surnamename: " + surname);
        System.out.println("Age: " + age);
    }

   
}
