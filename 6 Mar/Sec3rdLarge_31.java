//WAP to get 2nd and 3rd largest element from an array
import java.util.Scanner;
class Sec3rdLarge_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
        }
        
        int max1 = -1, max2 = -1, max3 = -1;
        for (int i = 0; i < size; i++) {
        if (arr[i] > max1) {
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
        } else if (arr[i] > max2 && arr[i] != max1) {
            max3 = max2;
            max2 = arr[i];
        } else if (arr[i] > max3 && arr[i] != max2 && arr[i] != max1) {
            max3 = arr[i];
        }
        }
        
        System.out.println("Second largest element: " + (max2 != -1 ? max2 : "Not found"));
        System.out.println("Third largest element: " + (max3 != -1 ? max3 : "Not found"));
    }
    }