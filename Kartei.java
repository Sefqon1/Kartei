import java.util.ArrayList;

public class Kartei {

    ArrayList<Freund> freunde = new ArrayList<>();

    public void addFreund(Freund freund) {

        freunde.add(freund);
    }

   public Freund getFreund(String searchNachname, int searchSchlussel) {

        Freund gesuchterFreund = null;
        for (Freund freund : freunde) {
;
            if (freund.getNachname().equalsIgnoreCase(searchNachname) && freund.getSchlussel() == searchSchlussel)
                gesuchterFreund = freund;
            }

        return gesuchterFreund;
    }

    public void delFreund(String delNachname, int delSchlussel) {

        if (freunde.remove(getFreund(delNachname, delSchlussel))) {
            System.out.println("Freund " + delNachname + " erfolgreich geloescht."); }
        else {
            System.out.println("Freund nicht in der Kartei oder schon geloescht.");
        }
    }

    public int getGesamtZahl() {

        int gesamtZahl = freunde.size();

        return gesamtZahl;
    }

}
