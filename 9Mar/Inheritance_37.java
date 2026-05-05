class Youtubeacc{
    protected String username;
    protected int subscribers;

    public void displayDetails() {
        System.out.println("Username: " + username);
        System.out.println("Subscribers: " + subscribers);
    }

    public void uploadVideo() {
        System.out.println(username + " is uploading a video.");
    }

}
class PremAcc extends Youtubeacc
{
    private boolean hasPremium;
    private double monthlyFee;
    public void activatePremium() {
        hasPremium = true;
        monthlyFee = 12.99;
        System.out.println(username + " has activated a Premium subscription for $" + monthlyFee + " monthly.");
    }
    public void watchWithoutAds() {
        if (hasPremium) {
            System.out.println(username + " is watching a video without ads.");
        } else {
            System.out.println(username + " needs to activate Premium to watch without ads.");
        }
    }
}

class Inheritance_37
{
    public static void main(String[] args) {
        PremAcc p1 = new PremAcc();

        // 2. Assign values to variables (including inherited ones)
        p1.username = "TechGuru";
        p1.subscribers = 5000;    
        

        // 3. Execute methods (including inherited ones)
        System.out.println("--- Accessing Base Class Methods ---");
        p1.displayDetails(); 
        p1.uploadVideo();    

        System.out.println("\n--- Accessing Derived Class Methods ---");
        p1.activatePremium(); 
        p1.watchWithoutAds(); 
    }
}