//Implement multilevel inheritance- take 3 classes: Class Rectangle to accept data, class Compute to perform calculation and class Result to print the output of the area of reactangle
import java.util.Scanner;
class Rectangle
{
    float length;
    float breadth;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter length:");
        length=sc.nextFloat();
        System.out.println("Enter breadth:");
        breadth=sc.nextFloat();
    }
}

class Compute extends Rectangle
{
    float area;
    public void calculateArea()
    {
        area= length*breadth;
    }
}

class Result extends Compute
{
    public void printResult()
    {
        calculateArea();
        System.out.println("Area of rectangle: "+area);
    }
}

class Inheritance_41
{
    public static void main(String args[])
    {
        Result r= new Result();
        r.accept();
        //r.calculateArea();
        r.printResult();
    }
}