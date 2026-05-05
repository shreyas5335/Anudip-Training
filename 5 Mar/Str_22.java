import java.util.Scanner;
class Str_22{
    public static void main(String[] args){
        String name;
        char Inpname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.next();
        Inpname=name.charAt(0);
        System.out.println("Your name is :"+name);
        System.out.println("Your name is :"+Inpname);
    }
}