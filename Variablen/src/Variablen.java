import javax.swing.*;
public class Variablen{
public static void main(String[] args) {

    //Variablen sind Container für einen Wert
    //Variablen verhalten sich so als wären sie der Wert

    //Beispiele für Variablen sind int, double, char, boolean, String
    //Variablen müssen deklariert und initialisiert werden

    int alter = 29;
    int Geburtsjahr = 1996;
    int Baujahr = 2001;

    double Listenpreis = 24999.99;
    double Wiederverkaufswert = 2499.99;
    double preisdifferenz = 20000.00;

    char Währung = '€';

    boolean zuHaben = false;
    boolean inMeinemBesitz = true;

    String autoMarke = "Toyota";
    String fahrzeugTyp = "Coupe";
    String fahrzeugModell = "Celica";
    String Name = "Angelo Solazzo";

    System.out.print("Ihr Name ist " + Name + ", Sie fahren einen " + autoMarke + " " + fahrzeugModell +
            " aus dem Jahre " + Baujahr + ".\n"
            + "Bei diesem Fahrzeug handelt es sich um ein " + fahrzeugTyp + " im Wert von " + Wiederverkaufswert + Währung);

    }


}