
/**
 * Write a description of class Course here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course 
{
    public String Coursename;
    public Teacher teacher;
    public static Student[] students = new Student[2];
    public static String[] grade = new String[2];

    /**
     * Constructor for objects of class Course
     */
    public Course()
    {
        // initialise instance variables

    }

    public Course(Teacher teacher, int numOfStudents)
    {
        setTeacher(teacher);
        setStudents(new Student[numOfStudents]);

    }

    public Course(String coursename, Teacher teacher, Student[] students)
    {
        setCourseName(coursename);
        setTeacher(teacher);
        setStudents(students);
    }

    public void setCourseName(String newCoursename)
    {
        Coursename = newCoursename;
    }

    public String getCoursename()
    {
        return Coursename;
    }

    public void setTeacher(Teacher newTeacher)
    {
        teacher = newTeacher;
    }

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setStudents(Student[] newStudent)
    {
        students = newStudent;
    }

    public Student[] getStudents()
    {
        return students;
    }

    public void display()
    {
        System.out.println("Course Name: " + getCoursename());
        //getTeacher().display();
        System.out.println("-----------------");


    }
}
