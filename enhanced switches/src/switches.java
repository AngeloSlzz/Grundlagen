import java.util.Scanner;
public class switches {
    public static void main(String[] args){

        // enhanced switches = Alternative zu mehreren else if Anweisungen.
        // (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        String tag;
        System.out.print("Bitte Wochentag eingeben: ");
        tag = scanner.nextLine();

        switch(tag){
            case
                "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" ->
                System.out.println("Es ist ein Wochentag.");

            case
                "Samstag", "Sonntag" ->
                System.out.println("Es ist Wochenende.");

            default ->
                System.out.println("Kein Wochentag.");
        }
    }
}
