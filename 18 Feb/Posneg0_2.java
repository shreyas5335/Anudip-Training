import java.util.Scanner;
class Posneg0_2
{
   public static void main(String[] args)
   {
     int a;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter any number:");
     a= sc.nextInt();
     if (a>0)
     {
        System.out.println("Number"+a+"is positive");
     }
     else if(a<0)
     {
        System.out.println("Number"+a+"is negative");
     }
     else
     {
        System.out.println("Number"+a+"is Zero");
     }
     
   }    
}