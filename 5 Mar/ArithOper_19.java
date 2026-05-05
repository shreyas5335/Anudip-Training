//apply all  arithmatic operators in one program
import java.util.Scanner;
class ArithOper_19{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition of a and b: "+ (a+b));
        System.out.println("Subtraction of a and b: "+ (a-b));
        System.out.println("Multiplication of a and b: "+ (a*b));
        System.out.println("Division of a and b: "+ (a/b));
        System.out.println("Modular Division of a and b: "+ (a%b));
    }
}