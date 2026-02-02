import java.util.Scanner;
public class Schleife3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zahl = 0;

        do{
            System.out.print("Gib eine Zahl zwischen 1 - 10 ein: ");
            zahl = scanner.nextInt();

        } while(zahl < 1|| zahl > 10 );
            System.out.println("Du hast die Zahl " + zahl + " eingegeben.");
    }
}
