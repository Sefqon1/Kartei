public class Adresse {

    public int plz = 0;
    public String ort;
    public String strasse;

    //Konstruktor fuer Fall, dass keine Parameter

    public Adresse(int plz, String ort, String strasse) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
    }

    //get set plz
    public int get_plz() {
        return plz;
    }

    public void set_plz(int new_plz) {
        this.plz = new_plz;
    }

    //get set ort
    public String get_ort() {
        return ort;
    }

    public void set_ort(String new_ort) {
        this.ort = new_ort;
    }

    //get set strasse
    public String get_strasse() {
        return strasse;
    }

    public void set_strasse(String new_strasse) {
        this.strasse = new_strasse;
    }
}