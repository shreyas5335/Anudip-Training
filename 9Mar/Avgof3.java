import java.util.Scanner;
class Avg{
        Scanner sc=new Scanner(System.in);
        double n1,n2,n3;
        double avg;
        void get(){
            System.out.println("Enter number1:");
            n1=sc.nextDouble();
            System.out.println("Enter number2:");
            n2=sc.nextDouble();
            System.out.println("Enter number3:");
            n3=sc.nextDouble();
        }
        void avg(){
            avg=(n1+n2+n3)/3;
            System.out.println("Average of "+n1+","+n2+","+n3+" : "+avg);
        }
}
class Avgof3{
    public static void main(String[] args){
        Avg avg=new Avg();
        avg.get();
        avg.avg();
    }
}
