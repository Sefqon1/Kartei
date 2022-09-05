public class Freund {

    private long int schlussel = 0;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;

    public Freund(String vorname,String nachname,String geburtsdatum,Adresse adresse) {
        schlussel++;
        this.schlussel = schlussel;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.adresse = adresse;
    }

    public int get_schlussel() {
        return schlussel;
    }

    public int get_vorname() {
        return vorname;
    }

    public void set_vorname(String new_vorname) {
        this.vorname = new_vorname;
    }

    public String get_nachname() {
        return nachname;
    }

    public void set_nachname(String new_nachname) {
        this.nachname = new_nachname;
    }

    public String (get_geburtsdatum() {
        return geburtsdatum;
    }

    public void set_geburtsdatum(String new_geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Adresse get_adresse() {
        return adresse;
    }

    public Void set_adresse(Adresse new_adresse) {
        this.adresse = new_adresse;
    }



}
