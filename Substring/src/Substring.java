import java.util.Scanner;
public class Substring {
    public static void main(String[] args){

        // substring() = wird genutzt, um einen Teilstring aus einem kompletten String zu extrahieren.
        // substring(anfang, ende);

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Bitte E-Mail-Adresse eingeben: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String nutzerName = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Dein Nutzername ist " + nutzerName);
            System.out.println("Die Domain ist " + domain);
        } else{
            System.out.println("E-Mail-Adressen müssen ein '@' enthalten.");
        }
        scanner.close();
    }
}
