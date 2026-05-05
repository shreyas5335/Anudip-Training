import java.util.Scanner;

public class Fibonacci_11 {

public static void main(String args[]){
	long a = 0, b = 1, n, temp;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	n=sc.nextLong();
	
	while(n > a){
		System.out.print(a + "\t");
		temp = a + b;
		a = b;
 		b = temp;
		
	}

}
}