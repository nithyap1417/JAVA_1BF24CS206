import java.util.*;
import CIE.*;
import SEE.*;
public class finalMarks 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals internal[] = new Internals[n];
        External external[] = new External[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter Student " + (i + 1) + " details:");

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int im[] = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                im[j] = sc.nextInt();

            int sm[] = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                sm[j] = sc.nextInt();

            internal[i] = new Internals(usn, name, sem, im);
            external[i] = new External(usn, name, sem, sm);
        }

        System.out.println("\n---------- FINAL MARKS ----------");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + internal[i].name + " (" + internal[i].usn + ")");
            System.out.println("Semester: " + internal[i].sem);

            for (int j = 0; j < 5; j++) {
                int finalMarks = internal[i].internalMarks[j] + (external[i].seeMarks[j] / 2);
                System.out.println("Subject " + (j + 1) + " = " + finalMarks);
            }
        }

        sc.close();
    }
}