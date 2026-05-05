//WAP to calculate Area of  circle, rectangle & square using Switch case
import java.util.Scanner;
class Area_21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter any choice:");
        System.out.println("1.Area of Circle \t 2.Area of Rectangle \t 3.Area of Circle");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter radius:");
                double pi=3.14;
                double r= sc.nextDouble();
                System.out.println("Area of circle: "+(pi*r*r));
            case 2:
                System.out.println("Enter length and breadth:");
                double len=sc.nextDouble();
                double br=sc.nextDouble();
                System.out.println("Area of rectangle: "+(len*br));
            case 3:
                System.out.println("Enter side of Square:");
                double side=sc.nextDouble();
                System.out.println("Area of Square: "+(side*side));
            default:
                System.out.println("Invalid input");
        }
    }
}