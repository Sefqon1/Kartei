public class Freund {

    private static int counter = 1;

    private int schlussel;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;

    public Freund(String vorname, String nachname, String geburtsdatum, Adresse adresse) {
        //Increments the key after asigning it to the new object attribute.
        //All friends will have concurrent keys.
        //Problem: Inefficiency in case of deletion. - Wasted memory
        this.schlussel = counter;
        counter++;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.adresse = adresse;
    }


    public int get_schlussel() {
        return schlussel;
    }
    //get set vorname
    public String get_vorname() {
        return vorname;
    }

    public void set_vorname(String new_vorname) {
        this.vorname = new_vorname;
    }
    // get set nachname
    public String get_nachname() {
        return nachname;
    }

    public void set_nachname(String new_nachname) {
        this.nachname = new_nachname;
    }
    //get set geburtsdatum
    public String get_geburtsdatum() {
        return geburtsdatum;
    }

    public void set_geburtsdatum(String new_geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    //get set adresse
    public Adresse get_adresse() {
        return adresse;
    }

    public void set_adresse(Adresse new_adresse) {
        this.adresse = new_adresse;
    }


     public static void main(String[] args) {
        Adresse adresse1 = new Adresse(71522, "Backnang", "Vorderer Weinberg 25");
        Freund severin = new Freund("Severin", "Kleesattel", "30.04.1996", adresse1);
        Freund peter = new Freund("Severin", "Kleesattel", "30.04.1996", adresse1);

        System.out.println(severin.schlussel + " " + peter.schlussel);


     }

}
