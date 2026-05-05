import java.util.Scanner;
class Evenodd_1
{
public static void main(String args[])
{
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    a= sc.nextInt(); 
    if(a%2==0)
    {
        System.out.println(a + " is an even number");
    }
    else
    {
        System.out.println(a + " is an odd number");
    } 
}
}