import java.util.Scanner;
public class Schleife2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String antwort = "a";

        while(!antwort.equalsIgnoreCase("q")){
            System.out.println("Du befindest dich in einer Schleife.");
            System.out.print("Zum Beenden bitte 'Q' eingeben: ");
            antwort = scanner.next();
        }

        scanner.close();
    }
}
