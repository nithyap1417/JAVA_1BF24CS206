abstract class Shape
{
    int a;
    int b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    Rectangle(int x, int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        System.out.println("Area of Recatngle is: "+(a*b));
    }
}
class Triangle extends Shape
{
    Triangle(int x, int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        System.out.println("Area of Triangle is: "+(0.5*a*b));
    }
}
class Circle extends Shape
{
    Circle(int radius)
    {
        a=radius;
    }
    void printArea()
    {
        System.out.println("Area of Circle is: "+(3.14*a*a));
    }
}
class ShowArea
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle(10,5);
        Triangle t=new Triangle(8,6);
        Circle c=new Circle(7);
        r.printArea();
        t.printArea();
        c.printArea();
    }

}

