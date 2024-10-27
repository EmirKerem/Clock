
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long currentTimeMillis = System.currentTimeMillis();
        
        
        long seconds = (currentTimeMillis / 1000) % 60;
        long minutes = (currentTimeMillis / (1000 * 60)) % 60;
        long hours = (currentTimeMillis / (1000 * 60 * 60)) % 24;
        
        System.out.println("Which GMT Time Zone is your country in?");
        short gmt = scanner.nextShort();

       System.out.printf("Time is : %02d:%02d:%02d\n", gmt + hours, minutes, seconds);
    }


    
}
