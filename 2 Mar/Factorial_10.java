import java.util.Scanner;

public class Factorial_10 {

public static void main(String args[]){
	long a;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	a=sc.nextLong();

	long fact = 1;
	
	for(long b = a; b > 0; b--){
		fact *= b; 

	}

	System.out.println("Factorial: " + fact);
}
}