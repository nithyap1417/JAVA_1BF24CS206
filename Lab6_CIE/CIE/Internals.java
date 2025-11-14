package CIE;
public class Internals extends Student{
    public int internalMarks[]=new int[5];
    public Internals(String n,String u,int sem, int marks[])
    {
        super(u,n,sem);
        for(int i=0;i<5;i++)
        {
            internalMarks[i]=marks[i];
        }
    }
}
