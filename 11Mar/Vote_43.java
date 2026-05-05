//WAP A PROGRAM TO VALIDATE WHETHER A PERSON IS ELIGIBLE TO VOTE OR NOT
import java.util.*;
class Vote{
    int age;
    Scanner sc = new Scanner(System.in);
    void get(){
       System.out.println("Enter your age:");
       age=sc.nextInt();
    }
    void eligible(){
        if(age>=18){
           System.out.println("You are eligible to vote!");
        }
        else if(age<18){
            System.out.println("You are not eligible to vote! ");
        }
        else{
            System.out.println("Invalid Input!!");
        }
    }
}
class Vote_43{
    public static void main(String[] args){
       Vote v=new Vote();
       v.get();
       v.eligible();
    }   
}