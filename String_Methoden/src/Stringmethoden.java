public class Stringmethoden {
    public static void main(String[] args){

        String name = "Angelo";

        int länge = name.length();
        char anfangsBuchstabe = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("A", "o");
        // name = name.isEmpty();

        if(name.isEmpty()){
            System.out.println("Dein Name ist leer.");

        } else{
            if(name.contains("n")){
                System.out.println("Hallo " + name);
                System.out.println("Dein Name hat ein 'n'.");

            }else {
                System.out.println("Hallo " + name);
            }
        }
    }
}
