//Multiple inheritance is not supported in Java to avoid ambiguity caused by the diamond problem.
//Java supports multiple inheritance using Interface concept.

interface Camera
{
    void takePhoto();
}

interface MusicPlayer
{
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer
{
    public void takePhoto()
    {
        System.out.println("Photos captured through SmartPhone");
    }
    public void playMusic()
    {
        System.out.println("Music is playing on SmartPhone");
    }
}

public class Inheritance_39
{
    public static void main(String args[])
    {
        SmartPhone sp=new SmartPhone();
        sp.takePhoto();
        sp.playMusic();
    }
}