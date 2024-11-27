public class VoziloRunner {
    public static void main(String[] args) {
        try {
            EvidencijaVozila evidencija = new EvidencijaVozila();

            Vozilo auto1 = new Automobil("ZG1234AB", "Toyota", 2015, 5);
            Vozilo auto2 = new Automobil("DU1234CD", "Honda", 2022, 3);
            Vozilo auto3 = new Automobil("NG323AZ", "Škoda", 2005, 5);
            //Vozilo test = new Automobil("NG323AZ", "Škoda", 2005, 0);


            Vozilo motor1 = new Motocikl("RI5678CD", "Yamaha", 2020, "Sportski");
            Vozilo motor2 = new Motocikl("SB5678AB", "Harley Davidson", 1998, "Chopper");
            Vozilo motor3 = new Motocikl("VU2323AB", "KTM", 2007, "Enduro");



            evidencija.dodajVozilo(auto1);
            evidencija.dodajVozilo(auto2);
            evidencija.dodajVozilo(auto3);
            //evidencija.dodajVozilo(test);

            evidencija.dodajVozilo(motor1);
            evidencija.dodajVozilo(motor2);
            evidencija.dodajVozilo(motor3);



            evidencija.ucitajPodatkeIzDatoteke("uvoz.txt");
            evidencija.spremiPodatkeUDatoteku("vozila.txt");
            // evidencija.ucitajPodatkeIzDatoteke("uvoz.txt");

            System.out.println("\nPodaci hardkodirani:");

            System.out.println("\n-------------------------------------------");


            evidencija.prikaziSvaVozila();

            System.out.println("\nPodaci učitani iz datoteke:");

            System.out.println("\n-------------------------------------------");

            evidencija.prikaziSvaVozila();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
