//WAP TO FIND LARGEST OF TWO NUMBERS
import java.util.*;
class Large_42{
    int a,b;
    Scanner sc= new Scanner(System.in);
    void get(){
        System.out.println("Enter 2 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void calcu(){
        if (a>b){
            System.out.println("a: "+a+" is largest number");
        }
        else {
            System.out.println("b: "+b+" is largest number");
        }
    }
    public static void main(String args[]){
        Large_42 l=new Large_42();
        l.get();
        l.calcu(); 
    }

}