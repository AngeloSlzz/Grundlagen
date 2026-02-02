import java.util.Scanner;

public class operatoren2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Nutzername muss zwischen 4-12 Zeichen lang sein.
        //Nutzername darf keine leerzeichen oder Unterstrich enthalten

        String nutzername;
        System.out.print("Gib deinen neuen Nutzernamen ein: ");
        nutzername = scanner.nextLine();

        if(nutzername.length() < 4 || nutzername.length() > 12){
            System.out.println("Nutzername muss zwischen 4-12 Zeichen lang sein.");

        } else if(nutzername.contains(" ") || nutzername.contains("_")){
            System.out.println("Nutzername darf keine Sonderzeichen enthalten.");

        } else {
            System.out.println("Willkommen " + nutzername);
        } scanner.close();
    }
}
