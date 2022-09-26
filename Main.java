
public class Main {




    public static void main(String[] args) {

        Kartei meineKartei = new Kartei();

        Freund severin = new FreundBuilder().withGeburtsdatum("30.04.1996").build();
        Freund peter = new FreundBuilder().withName("Peter", "Zwegat").withGeburtsdatum("34.13.1943").build();
        Freund heinz = new FreundBuilder().withName("Heinz", "Hurensohn").withAdresse(54321, "Ruebenkohl", "Gasseangel").build();

        meineKartei.addFreund(severin.getSchlussel(), severin);
        meineKartei.addFreund(peter.getSchlussel(), peter);
        meineKartei.addFreund(heinz.getSchlussel(), heinz);


        System.out.println(meineKartei.getFreund(1).getVorname());
        System.out.println(meineKartei.getGesamtzahl());

        meineKartei.delFreund(2);

        System.out.println(meineKartei.getGesamtzahl());

        for (Freund i : meineKartei.freunde.values()) {
            System.out.println(i.getVorname());
        }

        /*for (int i = 0; i < meineKartei.freunde.size(); i++ ) {
            System.out.println("Freund Nr: " + meineKartei.freunde.get(i).getSchlussel() + " ist " + meineKartei.freunde.get(i).getVorname() + " " + meineKartei.freunde.get(i).getNachname() +
                            "| Geburtsdatum: " + meineKartei.freunde.get(i).getGeburtsdatum() + "| Wohnhaft in: " + meineKartei.freunde.get(i).getAdresse().getPlz());
        }

        System.out.println(meineKartei.getFreund("zwegat", 2).getVorname());

        System.out.println(meineKartei.getGesamtZahl());


        meineKartei.delFreund("Zwegat", 2);
        meineKartei.delFreund("keinnachname", 1);

        for (int i = 0; i < meineKartei.freunde.size(); i++ ) {
            System.out.println("Freund Nr: " + i + " mit Schlussel " + meineKartei.freunde.get(i).getSchlussel() + " ist " + meineKartei.freunde.get(i).getVorname() + " " + meineKartei.freunde.get(i).getNachname() +
                    ". Wohnhaft in: " + meineKartei.freunde.get(i).getAdresse().getPlz() + " " + meineKartei.freunde.get(i).getAdresse().getOrt());
        }

        meineKartei.delFreund("Andreas", 5);

        System.out.println(meineKartei.getGesamtZahl()); */


    }

}
