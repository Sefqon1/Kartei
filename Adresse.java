public class Adresse {

    public int plz = 0;
    public String ort;
    public String strasse;

    public Adresse(int plz, String ort, String strasse) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
    }

    //get set plz
    public int getPlz() {
        return plz;
    }

    public void setPlz(int newPlz) {
        this.plz = newPlz;
    }

    //get set ort
    public String getOrt() {
        return ort;
    }

    public void setOrt(String newOrt) {
        this.ort = newOrt;
    }

    //get set strasse
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String newStrasse) {
        this.strasse = newStrasse;
    }
}