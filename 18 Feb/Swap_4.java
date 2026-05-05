//swap without 3rd variable

import java.util.Scanner;
class Swap_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter any two numbers:");
        a=sc.nextInt();
        b=sc.nextInt(); 
        temp=b;
        b=a;
        a=temp;
        //Without 3rd variable
        // a=a+b; //a=10+20=30
        // b=a-b;  //b=30-20= 10
        // a=a-b;  //a=30-10= 20
        System.out.println("After swapping: " );
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}