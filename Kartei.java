import java.util.HashMap;

public class Kartei {

    HashMap<Integer, Freund> freunde = new HashMap<>();

    public void addFreund(int schlussel, Freund freund) {

        freunde.put(schlussel, freund);
        System.out.println("Freund" + freund.getVorname() + " wurde erfolgreich der Kartei hinzugefügt. " + " Schlüssel: " + freund.getSchlussel());
    }

   public Freund getFreund(int schlussel) {

        Freund nullFreund = null;

        if (freunde.get(schlussel) != null) {
            return freunde.get(schlussel);
        }

        return nullFreund;
    }

    public void delFreund(int schlussel) {

        Freund removedFreund = freunde.remove(schlussel);
        if (removedFreund != null) {
            System.out.println(" Name: " + removedFreund.getVorname() + ", Schlüssel: " + removedFreund.getSchlussel() + "- erfolgreich gelöscht"); }
        else {
            System.out.println("Freund nicht in der Kartei oder schon geloescht.");
        }
    }

    public int getGesamtzahl() {

        int gesamtZahl = freunde.size();

        return gesamtZahl;
    }

}
