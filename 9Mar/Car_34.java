//WAP to explain car object
class Car_34{
    String brand,model;
    int year;
    void displayDetails()
    {
        System.out.println("Brand : "+ brand );
        System.out.println("Model : "+ model );
        System.out.println("Year : "+ year );
    }
    public static void main(String[] args){
        Car_34 cr1=new Car_34();
        cr1.brand="Mahindra";
        cr1.model="XUV";
        cr1.year=2020;

        Car_34 cr2=new Car_34();
        cr2.brand="Mercedes";
        cr2.model="Benz";
        cr2.year=2019;

        cr1.displayDetails();
        cr2.displayDetails();


    }
}
