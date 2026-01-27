import java.util.Scanner;

public class ifAnweisung {
    public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //if Anweisung = führt einen Programmabschnitt nur aus, wenn die Bedigung erfüllt ist

        String name;
        int alter;
        boolean istAzubi;

        //Reihenfolge beachten! Wenn eine Bedingung erfüllt ist, wird nicht
        //noch bei if-else geschaut.

        //Gruppe 1

        System.out.print("Bist du Azubi? (true/false): ");
        istAzubi = scanner.nextBoolean();
        scanner.nextLine();

        //Gruppe 2

        System.out.print("Wie heißen Sie?: ");
        name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("Sie haben Ihren Namen nicht eingegeben. ");
        }
        else{
            System.out.println("Hallo " + name + ".");
        }

        //Gruppe 3

        System.out.print("Wie alt sind Sie?: ");
        alter = scanner.nextInt();

        if(alter>=65){
            System.out.println("Sie sind ein Renter.");
        }
        else if(alter >= 25){
            System.out.println("Sie sind ein Erwachsener.");
        }
        else if(alter < 0){
            System.out.println("Sie wurden noch nicht geboren.");
        }
        else if(alter==0){
            System.out.println("Sie sind ein Baby");
        }
        else{
            System.out.println("Sie sind ein Kind!");
        }

        if(istAzubi){
            System.out.println("Sie sind Azubi!");
        }
        else{
            System.out.println("Sie sind kein Azubi!");
        }
        scanner.close();
    }
}
