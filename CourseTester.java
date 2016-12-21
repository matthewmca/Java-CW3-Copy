
/**
 * Write a description of class CourseTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CourseTester extends Course
{
    public static Student[] student = new Student[2];
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        Course course1 = new Course();

        System.out.println("Please enter course name");
        String courseName = input.next();

        course1.setCourseName(courseName);

        System.out.println("Please enter Teacher's Forename:");
        String teacherForename = input.next();
        System.out.println("Please enter Teacher's Surname:");
        String teacherSurname = input.next();
        System.out.println("Please enter teacher's age:");
        int teacherAge = input.nextInt();
        System.out.println("Please enter teacher's room number:");
        int teacherRoomnum = input.nextInt();

        Teacher teacher1 = new Teacher(teacherForename, teacherSurname, teacherAge, teacherRoomnum);

        for(int i =0; i<=student.length-1; i++)
        {
            System.out.println("Please enter Student's Forename:");
            String studentForename = input.next();
            System.out.println("Please enter Student's Surname:");
            String studentSurname = input.next();
            System.out.println("Please enter Student's age:");
            int studentAge = input.nextInt();
            System.out.println("Please enter Student's ID:");
            int studentID = input.nextInt();
            System.out.println("Please enter Student's mark:");
            double studentMark = input.nextDouble();

            student[i] = new Student(studentForename, studentSurname, studentAge, studentID, studentMark);
        }
        teacher1.display();

        for (int x=0; x<=student.length-1; x++)
        {
            student[x].display();
            checkMarks();

            System.out.println ("Grade: " + grade[x]);
            System.out.println("-------------");
        }
        highestMark();

    }

    public static void checkMarks()
    {
        for(int i = 0; i<=student.length-1; i++)
        {
            if (student[i].getMark() < 40)
            {
                grade[i] = "Resit"; 
            }
            else if (student[i].getMark() > 40 && student[i].getMark() < 60)
            {
                grade[i] = "Pass";
            }
            else
            {
                grade[i] = "Distinction";
            }
        }
    }

    public static void highestMark()
    {
        double highestMark = 0.0;
        for(int i=0;i <=student.length-1;i++)
        {
            if(highestMark < student[i].getMark())
            {
                highestMark = student[i].getMark(); 
                System.out.println(student[i].getForename() + " has the highest mark with " + student[i].getMark());
            }
            else
            {
                break;
            }

        }
    }
}
