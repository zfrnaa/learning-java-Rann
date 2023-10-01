//created by zafran - 20212022 q1

import java.util.Scanner;

class setIPod
{
    private String songName;
    private int volumeLevel;
    private boolean on = true;

    public setIPod()
    {

    }

    public void turnOn()
    {
        this.on = true;
        System.out.println("tutu");
    }

    public void turnOff()
    {
        this.on = false;
        System.out.println("turuturu");
        System.out.println("Is iPod on? " + isOn());
    }

    public boolean isOn()
    {
        return on;
    }

    public void setSongName(String newSong)
    {
        this.songName = newSong;
    }

    public void setVolumeLevel(int newVolumeLevel)
    {
        this.volumeLevel = newVolumeLevel;
    }

    public String getSong()
    {
        return songName;
    }

    public int volumeUp()
    {
        volumeLevel += 10;
        return volumeLevel;
    }

    public int volumeDown()
    {
        volumeLevel -= 10;
        return volumeLevel;
    }
}

public class myIPod
{
    public static void main(String[] args)
    {
        setIPod iPod = new setIPod();
        Scanner input = new Scanner(System.in);

        iPod.turnOn();
        System.out.println("Is iPod on? " + iPod.isOn());

        iPod.setSongName("Taylor Swift - Blank Space");
        System.out.println("Song: " + iPod.getSong());

        System.out.println("\nPlease the volume of the music as you wish");
        int newVolumeLevel = input.nextInt();
        iPod.setVolumeLevel(newVolumeLevel);
        System.out.print("Current volume level have been set to " + newVolumeLevel + ".");
        System.out.print(" Now we testing the volume level function");
        System.out.println("\nnew volume level is: " + iPod.volumeDown());
        System.out.println("new volume level is: " + iPod.volumeUp());
        input.nextLine();
        System.out.println("\nSet new song: ");
        String newSong = input.nextLine();
        iPod.setSongName(newSong);
        System.out.println("Song: " + iPod.getSong());

        iPod.turnOff();
    }
}