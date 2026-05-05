//Addition of two arrays
import java.util.Scanner;
class ArrAdd_26{
    public static void main(String[] args) {
        

        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};

        int sumArr[]=new int[5];
        for(int i=0; i<5; i++){
            sumArr[i]=arr1[i]+arr2[i];
        }
        for (int i = 0; i < sumArr.length; i++) {
            System.out.print("\t"+sumArr[i]);
        }
    }
}


