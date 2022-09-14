import static java.lang.System.out.println;
public class Main {

    public static void main(String[] args) {

        println("Willkommen zu deiner Freundeskartei! Möchtest du eine eigene Kartei erstellen oder eine kurze Demo bekommen?");
        println("Gebe K ein fuer das Erstellen und D ein fuer Demo. Q fuer das Beenden");

        String input = System.console().readline();

        if (input == "K") {
            println("Kartei");

        } else if (input == "D") {
            println("D");

        } else if (input == "Q") {
            exit();

        }
        else {
            println("Bitte nutze einen der vorgegebenen Befehle");
        }


    }

}
