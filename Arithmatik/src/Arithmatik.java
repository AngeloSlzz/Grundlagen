import java.sql.SQLOutput;

public class Arithmatik {

    public static void main(String[] args){

        //Arithmatische Operatoren

        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;

        z = x + y;

        System.out.println(z);

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //Integer Division (Keine Nachkommastellen)

        x += y;

        System.out.println(x);

        //Inkrement und Dekrement
        int f = 1;

        f++;
        f++;
        f--;
        f--;

        System.out.println(f);

        //Rangfolge der Java-Operatoren beachten

        double result = 3 * 4 * (7 - 5) / 2;

        System.out.println(result);
    }
}
