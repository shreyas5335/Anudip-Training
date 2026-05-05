//WAP TO FIND LARGEST AMONG 3 NUMBERS
import java.util.*;
class Large_44{
    int a,b,c;
    Scanner sc= new Scanner(System.in);
    void get(){
        System.out.println("Enter 3 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    void calcu(){
        if (a>b && a>c){
            System.out.println("a: "+a+" is largest number");
        }
        else if(b>c && b>a ){
            System.out.println("b: "+b+" is largest number");
        }
        else if(c>a && c>b){
            System.out.println("c: "+c+" is largest number"); 
        }
        else{
            System.out.println("Enter valid inputs!!");
        }
    }
    public static void main(String args[]){
        Large_44 l=new Large_44();
        l.get();
        l.calcu(); 
    }

}