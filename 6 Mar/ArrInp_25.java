//Accept array input and print the elements of the array
import java.util.Scanner;
class ArrInp_25{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The elements of the array are:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}