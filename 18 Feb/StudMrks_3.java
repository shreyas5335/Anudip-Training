import java.util.Scanner;
class StudMrks_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student:");
        marks = sc.nextInt();
        if(marks>=75)
            System.out.println("Distinction");
        else if(marks>60)
            System.out.println("First class");
        else if(marks>=40 && marks<60)
            System.out.println("Second Class");
        else
            System.out.println("Fail");
    }
}