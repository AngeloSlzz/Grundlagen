public class printf3 {
    public static void main(String[] args) {

        //printf() ist eine Methode um Ausgaben zu formatieren
        //%[flags][width][.precision][specifier-character]

        // 0x = links Nullen um x hinzufügen (id1 = 1; wird zu "0001")
        // number = vorher leere Zeichen (id2 = 23; wird zu "  23")
        // negative number = leere Zeichen danach (id3 = 312; wird zu "312 "

        int id1 = 1;
        int id2 = 23;
        int id3 = 312;
        int id4 = 4812;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%4d\n", id4);

    }
}