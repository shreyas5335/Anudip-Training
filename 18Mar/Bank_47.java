//when a bank account is created it must have 
//acc no
//acc holder name
//and balance
//create constructor to initialize this details while obj is created.

class Bank_47{
    long acc_no;
    String Acc_holder;
    double balance;
    Bank_47(long acc_no, String Acc_holder, double balance){
        this.acc_no=acc_no;
        this.Acc_holder=Acc_holder;
        this.balance=balance;
    }

    void display(){
        System.out.println("Account no: "+ acc_no);
        System.out.println("Account holder: "+Acc_holder);
        System.out.println("Balance: "+ balance);
    }
    public static void main(String args[]){
        Bank_47 b1=new Bank_47(1234567890875432865498L",  Sushankt Keni",45000);
        b1.display();
        Bank_47 b2=new Bank_47(9875432345678987676545L,"Monish Vichute",75080);
        b2.display();
    }
}