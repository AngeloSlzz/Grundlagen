public class printf {
    public static void main(String[] args){

        //printf() ist eine Methode um Ausgaben zu formatieren
        //%[flags][width][.precision][specifier-character]

        String name = "Angelo"; // %s
        char anfangsbuchstabe = 'A'; // %c
        int alter = 29; // %d
        double groesse = 173.5; // %f
        boolean istAzubi = false; // %b

        System.out.printf("Hallo %s\n", name);
        System.out.printf("Dein Name beginnt mit dem Buchstaben %c\n", anfangsbuchstabe);
        System.out.printf("Du bist %d Jahre alt\n", alter);
        System.out.printf("Du bist %.1fcm groß\n", groesse);
        System.out.printf("Azubi: %b\n", istAzubi);

        System.out.printf("%s ist %d alt", name, alter);

    }
}
