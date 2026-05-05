class MobilePhone
{
    int battery;
    String brand;
    void makeCall(){
        System.out.println("Making a call..");
    }
    void showDetails()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Battery: "+battery+"%");
    }
   
}
class Smartphone extends MobilePhone
{
    void takePhoto(){
        System.out.println("Taking Photo using Camera!!!");
    }
    void useInternet()
    {
        System.out.println("Browsing Internet");
    }
}
public class InheriTest_36{
    public static void main(String[] args)
    {
        Smartphone phone=new Smartphone();
        phone.brand="Samsung";
        phone.battery=80;
        phone.makeCall();
        phone.showDetails();
        phone.takePhoto();
        phone.useInternet();

    }
}