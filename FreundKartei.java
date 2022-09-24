import java.util.HashMap;

public class FreundKartei extends Kartei<Freund> {
    /**
     * Overrides parent `add` to inject additional logging
     */
    public void add(Freund item) {
        super.add(item);
        System.out.println("Freund" + item.getVorname() + " wurde erfolgreich der Kartei hinzugefügt. " + " Schlüssel: " + item.getSchlussel());
    }

    /**
     * Overrides parent `del` to inject additional logging
     */
    public Freund del(int schlussel) {
        Freund removedFreund = super.del(schlussel);
        if (removedFreund != null) {
            System.out.println(" Name: " + removedFreund.getVorname() + ", Schlüssel: " + removedFreund.getSchlussel() + "- erfolgreich gelöscht");
        } else {
            System.out.println("Freund nicht in der Kartei oder schon geloescht.");
        }
        return removedFreund;
    }
}
