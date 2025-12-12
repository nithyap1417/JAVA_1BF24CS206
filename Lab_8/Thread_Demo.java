class Thread1 extends Thread{
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class Thread2 extends Thread{
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class Thread_Demo
{
    public static void main(String[] args) 
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}