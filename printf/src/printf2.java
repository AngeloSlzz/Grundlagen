public class printf2 {
    public static void main(String[] args){

        //printf() ist eine Methode um Ausgaben zu formatieren
        //%[flags][width][.precision][specifier-character]

        // .x Präzision der Nachkommastelle
        // + = Plus vor positiven Zahlen
        // , = Punkt an den Tausenderstellen
        // Leerzeichen = leerzeichen vor positiven Zahlen


        double preis1 = 9000.99;
        double preis2 = 100000.99;
        double preis3 = -54000.34;

        System.out.printf("%,+.1f\n", preis1);
        System.out.printf("%,+.1f\n", preis2);
        System.out.printf("%,+.1f\n", preis3);


    }
}
