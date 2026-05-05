//WAP TO CREATE CLASS PERSON WITH MEMEBERS (NAME,AGE,CITY) &CHECK AGE OF A PERSON WHETHER HE IS ADULT OR NOT.
import java.util.Scanner;
class Person_35
{
    Scanner sc=new Scanner(System.in);
    int age;
    String name,city;
    void getDetails(){
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter City:");
        city=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
    }
    void displayDetails(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nCity : "+city);
    }
    void checkAge(){
        if(age>=18){
            System.out.println("You are an Adult!!!");
        }
        else if(age<18){
            System.out.println("You are under age!!!");
        }
        else{
             System.out.println("Invalid age");
        }        
    }
    public static void main(String[] args){
        Person_35 pr=new Person_35();
        pr.getDetails();
        pr.displayDetails();
        pr.checkAge();
    }
}

