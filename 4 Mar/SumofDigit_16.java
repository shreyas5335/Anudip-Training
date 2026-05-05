import java.util.Scanner;
//WAP to get sum of digits of user accepted number

class SumofDigit_16
{
    public static void main(String args[]){
        int sum,in,rem;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an input:");
        int n=sc.nextInt();
         sum = 0;
        
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of input digits:"+sum);

    }
}
