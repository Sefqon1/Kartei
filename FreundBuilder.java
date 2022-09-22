public class FreundBuilder {

    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;

    public FreundBuilder() {

    }

    public FreundBuilder withName(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;

        return this;
    }

    public FreundBuilder withGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;

        return this;
    }

    public FreundBuilder withAdresse(int plz, String ort, String strasse) {
        this.adresse = new Adresse(plz, ort, strasse);

        return this;
    }

    public Freund build() {

        Freund freund = new Freund(this.vorname, this.nachname, this.geburtsdatum);
        freund.setAdresse(this.adresse);
        System.out.println(freund.getVorname()+ " erfolgreich erstellt." + "  Schlüssel: "+ freund.getSchlussel());

        return freund;
    }


}
