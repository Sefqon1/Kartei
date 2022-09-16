public class Freund {

    private static int counter = 1;

    private int schlussel;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;

    public Freund(String vorname, String nachname, String Geburtsdatum) {
        this.schlussel = counter;
        counter++;

        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }




    public int getSchlussel() {
        return schlussel;
    }
    //get set vorname
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String newVorname) {
        this.vorname = newVorname;
    }
    // get set nachname
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String newNachname) {
        this.nachname = newNachname;
    }
    //get set geburtsdatum
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String newGeburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    //get set adresse
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse newAdresse) {

        this.adresse = newAdresse;
    }




}
