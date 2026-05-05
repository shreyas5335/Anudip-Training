import java.util.Scanner;
class BillAmts_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double units,bilamt;
        System.out.println("Enter your monthly elcetricity units:");
        units = sc.nextInt();
        if(units<=100)
        {
            bilamt=100*1.50;
            System.out.println("Total bill amount is:"+bilamt);
        }
        else if(units<=200)
        {
            bilamt=(100*1.50)+(units-100)*2.50;
            System.out.println("Total bill amount is:"+bilamt);
        }
        else if(units<=300){
             bilamt=(100*1.50)+(100*2.50)+(units-200)*3.50;
            System.out.println("Total bill amount is:"+bilamt); 
            System.out.println("Total bill amount is:"+bilamt);
        }
        else
        {
            bilamt=(100*1.50)+(100*2.50)+(100*3.50)+(units-300)*4.50;
            System.out.println("Total bill amount is:"+bilamt);
        }
    }
}

//