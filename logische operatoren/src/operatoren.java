public class operatoren {
    public static void main(String[] args){

        // && = und (beide Bedingungen müssen erfüllt sein)
        // || = oder (nur eine von beiden Bedingungen muss erfüllt sein)
        // !  = nicht (eine Bedingung darf nicht erfüllt sein)

        double temp =35;
        boolean istSonnig = false;

        if(temp <= 30 && temp >= 0 && istSonnig){
            System.out.println("Das Wetter ist gut");
            System.out.println("Draußen ist es sonnig");

        } else if(temp <= 30 && temp >= 0 && !istSonnig){
            System.out.println("Das Wetter ist gut");
            System.out.println("Draußen ist es wolkig");
        }
        else if(temp > 30 || temp <0) {
            System.out.println("Das Wetter ist schlecht");
        }
    }
}
