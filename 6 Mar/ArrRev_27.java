// take input from array and reverse it. Store it in different array and display it
import java.util.Scanner;
class ArrRev_27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] revArr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
        }
        
        // Reverse the array
        for (int i = 0; i < size; i++) {
        revArr[i] = arr[size - 1 - i];
        }
        
        // Display the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
        System.out.print(revArr[i] + " ");
        }
        
        sc.close();
    }
}