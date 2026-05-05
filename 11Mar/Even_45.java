//WAP TO CHECK WHETHER A NUMBER IS EVEN OR NOT
import java.util.*;
class Even_45{
    Scanner sc =new Scanner(System.in);
    int in;
    void get(){
        System.out.println("Enter any number:");
        in=sc.nextInt();
    }
    void isEven(){
        if(in%2==0){
            System.out.println("Input "+in+"is even");
        }
        else if((in%2!=0)){
            System.out.println("Input "+in+"is not even");
        }
    }
    public static void main(String[] args){
        Even_45 ev=new Even_45();
        ev.get();
        ev.isEven();
    }
}