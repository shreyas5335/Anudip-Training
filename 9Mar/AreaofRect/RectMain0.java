import java.util.Scanner;
class Rectangle{
    int len,width,area;
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter length and breadth of the rectnagle:");
        len=sc.nextInt();
        width=sc.nextInt();
    }
    public void calculate(){
        area=len*width;
        System.out.println("Area of Rectnagle:"+area);
    }
}

class RectMain0{
    public static void main(String[] args){
        Rectangle rc=new Rectangle();
        rc.accept();
        rc.calculate();
    }
}