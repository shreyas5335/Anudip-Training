//WAP A PROGRAM TO REVERSE A NUMBER FROM INPUT

class Revrsenum_14{
    public static void main(String[] args) {
        int num=12345,rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}