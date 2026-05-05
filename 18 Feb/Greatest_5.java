import java.util.Scanner;
class Greatest_5
{
    public static void main(String[] args) {

        int a,b, max;
        Scanner sc = new Scanner(System.in);
        
       // System.out.println("Enter the number of elements in the array:");
       System.out.println("Enter any two numbers:");
       a= sc.nextInt();
       b= sc.nextInt();

       if(a>b)
          System.out.println(a + " is greater than " + b);
       else
          System.out.println(b + " is greater than " + a);
    }

}