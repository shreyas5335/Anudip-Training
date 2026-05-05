// WAP TO CREATE TRAFFIC SIGNAL INDICATOR/HIGHLIGHTER 
// WHICH SHOWS YOUR ABOUT SPEED OF VEHICLE
// BASED ON INPUT GIVEN BY USER
class Traff_33{
    public static void main(String[] args){
         int speed = 80; // Example speed input from user
        if (speed < 30) {
            System.out.println("Green Light: You are within the speed limit.");
        } else if (speed >= 30 && speed < 60) {
            System.out.println("Yellow Light: You are approaching the speed limit.");
        } else {
            System.out.println("Red Light: You are exceeding the speed limit!");
        }
        
    }

}