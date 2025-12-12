class WrongAgeException extends Exception
{
    WrongAgeException(String message)
    {
        super(message);
    }
}

class Father
{
    int Fage;
    Father(int age) throws WrongAgeException
    {
        if(age<0)
        {
            throw new WrongAgeException("Father's age cannot be Negative!!");
        }
        Fage=age;
        System.out.println("Father's Age: "+Fage);
    }
}

class Son extends Father
{
    int Sage;
    Son(int Fage, int Sage) throws WrongAgeException
    {
        super(Fage);    
        if(Sage>=Fage)
        {
            throw new WrongAgeException("Son's age cannot be greater than Father's age");
        }
        this.Sage=Sage;
        System.out.println("Father's Age: "+Fage);
        System.out.println("Son's Age: "+Sage);
    }

}

public class Exception_Demo
{
    public static void main(String[] args)
    {
        try
        {
            Son s=new Son(40,20);
            System.out.println("Object created successfully!");
        }
        catch(WrongAgeException e)
        {
            System.out.println("Execption: "+e.getMessage());
        }
        try
        {
            Son s=new Son(40,45);
            System.out.println("Object created successfully!");
        }
        catch(WrongAgeException e)
        {
            System.out.println("Execption: "+e.getMessage());
        }
        try
        {
            Father f=new Father(-2);
            System.out.println("Object created successfully!");
        }
        catch(WrongAgeException e)
        {
            System.out.println("Execption: "+e.getMessage());
        }
    }
}