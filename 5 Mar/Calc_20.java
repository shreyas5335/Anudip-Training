//WAP to create basic calculator
import java.util.Scanner;
class Calc_20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n1,n2,ans;
        int ch;
        System.out.println("Enter your choice: ");
        System.out.println("1. Addition \t 2.Subtraction\t 3.Multiplication\t 4.Divison\t ");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter Num 1: ");
                n1=sc.nextDouble();
                System.out.println("Enter Num 2: ");
                n2=sc.nextDouble();
                System.out.println("Addition of"+n1+"and"+n2+": "+(n1+n2));
            case 2:
                System.out.println("Enter Num 1: ");
                n1=sc.nextDouble();
                System.out.println("Enter Num 2: ");
                n2=sc.nextDouble();
                System.out.println("Subtraction of"+n1+"and"+n2+": "+(n1-n2));
            case 3:
                System.out.println("Enter Num 1: ");
                n1=sc.nextDouble();
                System.out.println("Enter Num 2: ");
                n2=sc.nextDouble();
                System.out.println("Multiplication of"+n1+"and"+n2+": "+(n1*n2));
            case 4:
                System.out.println("Enter Num 1: ");
                n1=sc.nextDouble();
                System.out.println("Enter Num 2: ");
                n2=sc.nextDouble();
                System.out.println("Division of"+n1+"and"+n2+": "+(n1/n2));
            default:
                System.out.println("Invalid output");
        }
    }
}