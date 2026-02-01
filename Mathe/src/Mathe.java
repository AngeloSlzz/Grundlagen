import java.util.Scanner;
public class Mathe {
    public static void main(String[] args){

        //System.out.print(Math.PI)
        //System.out.println(Math.E);

        double ergebnis;
        ergebnis = Math.pow(2, 5);
        ergebnis = Math.abs(-5);
        ergebnis = Math.sqrt(3.14);
        ergebnis = Math.ceil(3.14);
        ergebnis = Math.floor(3.99);
        ergebnis = Math.max(10, 20);
        ergebnis = Math.min(10, 20);

        Scanner scanner = new Scanner(System.in);

        String rechenoperation;

        System.out.print("Was möchtest du machen?: ");
        rechenoperation = scanner.nextLine();

        if(rechenoperation.equalsIgnoreCase("Hypotenuse")) {

            //Hypotenuse: c = Math.sqrt(a² + b²)

            double a;
            double b;
            double c;
            String einheit;

            System.out.print("Gib die Maßeinheit an: ");
            einheit = scanner.nextLine();

            System.out.print("Gib die Länge der Seite 'a' an: ");
            a = scanner.nextDouble();

            System.out.print("Gib die Länge der Seite 'b' an: ");
            b = scanner.nextDouble();

            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Die Hypothenuse 'c' beträgt: " + c + einheit);

            scanner.close();

        } else if(rechenoperation.equalsIgnoreCase("Kreisrechnung")) {

            double radius;
            double umfang;
            double fläche;
            double volumen;

            System.out.print("Gib den Radius des Kreises an: ");
            radius = scanner.nextDouble();

            umfang = 2 * Math.PI * radius;
            fläche = Math.PI * Math.pow(radius, 2);
            volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.printf("Der Umfang beträgt %.1fcm\n", umfang);
            System.out.printf("Die Fläche beträgt %.1fcm²\n", fläche);
            System.out.printf("Das Volumen beträgt %.1fcm³\n", volumen);

            scanner.close();

        } else {
            System.out.println("Bitte eine valide Rechenoperation eingeben!");
            scanner.close();





        }
    }
}
