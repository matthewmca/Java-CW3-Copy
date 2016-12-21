
/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private int roomNumber;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher()
    {
        roomNumber = 0;
    }

    public Teacher(String forname, String surname, int age, int roomNumber)
    {
        super(forname, surname, age);
        setRoomNumber(roomNumber);
    }
    
    public void setRoomNumber(int newRoomNumber)
    {
        roomNumber = newRoomNumber;
    }
    
    public int getRoomNumber()
    {
        return roomNumber;
    }
    
    public void display()
    {
        System.out.println("Class Teacher");
        System.out.println("-------------");
        super.display();
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("-------------");
    }
}

