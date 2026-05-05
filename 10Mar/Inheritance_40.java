//Create interface Payment with method Pay(). Implement this interface in UPI payment and Cash Payment class

interface Payment
{
    void pay();
}

class UPI_payment implements Payment
{
    public void pay()
    {
        System.out.println("Paying through UPI");
    }
}

class CashPayment implements Payment
{
    public void pay()
    {
        System.out.println("Paying with cash");
    }
}

public class Inheritance_40
{
    public static void main(String args[])
    {
        UPI_payment up=new UPI_payment();
        up.pay();
        CashPayment cp=new CashPayment();
        cp.pay();
    }
}