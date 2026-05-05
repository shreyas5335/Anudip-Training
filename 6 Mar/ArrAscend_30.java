//Arrange elements of array in Ascending order
//TRY MANUALLY
import java.util.Scanner;
class ArrAscend_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp = 0;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Corrected sorting logic (Bubble Sort implementation)
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) { // Corrected inner loop condition
                if (arr[i] > arr[j]) {
                    temp = arr[i]; // Swap logic
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Elements in Ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
