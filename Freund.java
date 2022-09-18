public class Freund {

    private static int counter = 1;

    private int schlussel;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;

    public Freund(String vorname, String nachname, String geburtsdatum) {
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
        String nullReturnCatch = "Kein Vorname hinterlegt ";

        if (vorname != null) {
            return vorname;
        }

        return nullReturnCatch;

    }

    public void setVorname(String newVorname) {
        this.vorname = newVorname;
    }
    // get set nachname
    public String getNachname() {
        String nullReturnCatch = " Kein Nachname hinterlegt ";

        if (nachname != null) {
            return nachname;

        }

        return nullReturnCatch;
    }


    public void setNachname(String newNachname) {
        this.nachname = newNachname;
    }
    //get set geburtsdatum
    public String getGeburtsdatum() {

        String nullReturnCatch = " Kein Geburtsdatum hinterlegt ";

        if (geburtsdatum != null) {
            return geburtsdatum;

        }

        return nullReturnCatch;
    }

    public void setGeburtsdatum(String newGeburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    //get set adresse
    public Adresse getAdresse() {

        Adresse nullReturnCatch = new Adresse(0000, " Kein Ort hinterlegt. ", " Keine Strasse hinterlegt. ");

        if (adresse != null) {
            return adresse;
        }
        return nullReturnCatch;
    }

    public void setAdresse(Adresse newAdresse) {
            this.adresse = newAdresse;
    }




}
