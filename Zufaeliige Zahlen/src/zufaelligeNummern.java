import java.util.Random;
public class zufaelligeNummern {
} public static void main(String[] args) {

    Random random = new Random();
    // Zahl zu groß, kann mit z.b Int((origin)1, (bound)7) eingegrenzt werden.
    int zahl;
    int zahl2;
    int zahl3;

    double zahl4;
    double zahl5;

    boolean münzWurf;

    zahl = random.nextInt(1, 11);
    zahl2 = random.nextInt(1, 101);
    zahl3 = random.nextInt(1, 1001);
    zahl4 = random.nextDouble(1, 10001);
    zahl5 = random.nextDouble(1, 100001);
    münzWurf = random.nextBoolean();


    System.out.println(zahl);
    System.out.println(zahl2);
    System.out.println(zahl3);
    System.out.println(zahl4);
    System.out.println(zahl5);
    if(münzWurf){
        System.out.println("Kopf!");
    } else{
        System.out.println("Zahl!");
    }
}


