
public class Main {



    //Exception handling
    public static void main(String[] args) {

        Kartei meineKartei = new Kartei();

        Freund severin = new FreundBuilder().withName("Severin", "Kleesattel").withAdresse(71522, "Backnang", "Vorderer Weinberg").build();

        System.out.println(severin.getVorname() + " " + severin.getAdresse().getPlz());
        System.out.println(severin.getGeburtsdatum());



    }

}
