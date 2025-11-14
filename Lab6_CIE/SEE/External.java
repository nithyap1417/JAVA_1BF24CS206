package SEE;
import CIE.Student;
public class External extends Student
{
    public int seeMarks[]=new int[5];
    public External(String u, String n,int sem, int marks[])
    {
        super(u,n,sem);
        for(int i=0;i<5;i++)
        {
            seeMarks[i]=marks[i];
        }
    }

}
