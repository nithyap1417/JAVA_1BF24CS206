import java.util.Scanner;
class Book
{
    String name;
    String author;
    double price;
    int num_pages;
    Book(String n, String a,double p, int np)
    {
        name=n;
        author=a;
        price=p;
        num_pages=np;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setAuthor(String a)
    {
        author=a;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void setNumPages(int np)
    {
        num_pages=np;
    }
    public String getName(String n)
    {
        return name;
    }
    public String getAuthor(String a)
    {
        return author;
    }
    public double getPrice(double p)
    {
        return price;
    }
    public int getNumPages(int np)
    {
        return num_pages;
    }
    public String toString()
    {
        return "\nBoook Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of Pages: "+num_pages+"\n";
    }
}
public class BookDemo
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter NUmber of Books: ");
        int n=sc.nextInt();
        sc.nextLine();
        Book[] Books=new Book[n];
        for (int i=0;i<n;i++){
            System.out.println("\nEnter details of Book "+(i+1)+":");
            System.out.println("Name:");
            String name=sc.nextLine();
            System.out.println("Author: ");
            String author=sc.nextLine();
            System.out.println("Price: ");
            double price=sc.nextDouble();
            System.out.println("Number of Pages: ");
            int num_pages=sc.nextInt();
            sc.nextLine();
            Books[i]=new Book(name,author,price,num_pages);
        }
        System.out.println("\nBook Details: ");
        for (Book b: Books){
            System.out.println(b.toString());
        }
        sc.close();
    }
}

