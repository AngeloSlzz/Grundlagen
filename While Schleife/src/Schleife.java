import java.util.Scanner;

public class Schleife {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Bitte Namen eingeben: ");
            name = scanner.nextLine();
        }

        System.out.println("Hallo "+ name);

        scanner.close();
    }
}
