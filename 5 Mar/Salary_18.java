//WAP to display total salary of a person. 
// Accept basic salary from the user .12% of basic salary is pf
//10% HRA of basic salary
//12% DA of basic salry 
//calculate net salary
import java.util.Scanner;
class Salary_18{
    public static void main(String[] args) {
        double basicSalary, pf,hra,da,net;// Example basic salary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();
        pf = 0.12 * basicSalary; // 12% of basic salary
        hra = 0.10 * basicSalary; // 10% of basic salary
        da = 0.12 * basicSalary; // 12% of basic salary

        double netSalary = basicSalary + pf + hra + da; // Calculate net salary

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("PF (12%): " + pf);
        System.out.println("HRA (10%): " + hra);
        System.out.println("DA (12%): " + da);
        System.out.println("Net Salary: " + netSalary);
    }
}
