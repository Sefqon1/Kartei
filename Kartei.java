import java.util.ArrayList;

public class Kartei {

    ArrayList<Freund> freunde = new ArrayList<>();

    public void addFreund(Freund freund) {
        freunde.add(freund);
    }

   /* public Freund get_freund(String search_nachname, int search_schlussel) {
        for (Freund freund : freunde) {
            if (freund.nachname.search_nachname.toLowerCase() == search_nachname.toLowerCase() && freund.schlussel == search_schlussel) {
                return freund;
                break;
            } else {
                continue;
            }
        }
        System.out.println("Freund nicht in der Kartei.");


    }


    public void del_freund(String del_nachname, int del_schlussel) {

        if (freunde.remove(get_freund(del_nachname, del_schlussel))) {
            System.out.println("Freund erfolgreich geloescht."); }
        else {
            System.out.println("Freund nicht in der Kartei oder schon geloescht.");
        }
    } */

    public int getGesamtZahl() {
        return freunde.size();
    }

}
