//Minimum number in an array
import java.util.Scanner;
class ArrMax_29{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    int max = arr[0];
    for (int i = 1; i < size; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    
    System.out.println("The maximum number in the array is: " + max);
  }
}