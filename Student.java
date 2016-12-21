
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int studentID;
    private double mark;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        studentID = 0;
        mark = 0;

    }

    public Student(String forename, String surname, int age, int studentID, double mark)
    {
        super(forename,surname,age);
        setStudentID(studentID);
        setMark(mark);   
    }

    public void setStudentID (int newStudentID)
    {
        studentID = newStudentID; 
    }

    public int getStudentID ()

    {
        return studentID;
    }

    public void setMark (double newMark)
    {
        mark = newMark; 
    }

    public double getMark ()

    {
        return mark;
    }

    public void display()
    {
        System.out.println("Student");
        System.out.println("-------------");
        super.display();
        System.out.println ("StudentID: " + getStudentID());
        System.out.println ("Mark: " + getMark());

    }
}
