import java.util.ArrayList;

public class Kartei {

    ArrayList<Freund> freunde = new ArrayList<Freund>();
    int gesamtZahl = 0;

    Kartei(Freund freund) {
        gesamtZahl++;
        ArrayList<Freund> = new freund;
    }

    public Freund get_freund(String search_nachname, long int search_schlussel) {

        for (int i = 0; i <= gesamtZahl; i++) {
            if (ArrayList[i].nachname == search_nachname && ArrayList[i].schlussel == search_schlussel) {
                Freund found_freund = ArrayList[i];
                return found_freund;
                break;
            } else if {
                continue;
            }
        }
        System.out.println("Freund nicht in der Kartei.");


    }

    //public void set_freund(Freund new_freund)


    public void del_freund(String del_nachname, long int del_schlussel) {

        for (int i = 0; i <= gesamtZahl; i++) {
            if (ArrayList[i].nachname == search_nachname && ArrayList[i].schlussel == search_schlussel) {
                ArrayList[i] = null;
            } else {
                continue;
            }
        }

        System.out.println("Freund nicht in der Kartei oder schon geloescht.");
    }

    public int get_gesamtZahl() {
        return gesamtZahl;
    }

}