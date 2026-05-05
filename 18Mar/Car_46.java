//WHEN A CUSTOMER BOOKS A CAR, THE SYSTEM SHOULD:
//STORE CAR NAME 
//STORE PRICE AND CUSTOMER NAME

class Car_46{
    String carName, custName;
    int price;
    Car_46(String cname, int pri, String custname){             //Formal parameters
               carName=cname;
               price=pri;
               custName=custname;
    }
    void display(){
        System.out.println("Car name:"+carName);
        System.out.println("Price:"+price);
        System.out.println("Customer name:"+custName);
        
    }
    public static void main (String[] args){
        Car_46 c=new Car_46("Toyata",900000,"Sujeet Mondal");
        c.display();

    }
}