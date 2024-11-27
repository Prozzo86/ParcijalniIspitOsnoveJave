import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {
    private List<Vozilo> vozila;

    public EvidencijaVozila() {
        vozila = new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void prikaziSvaVozila() {
        for (Vozilo vozilo : vozila) {
            vozilo.prikaziPodatke();
            System.out.println("-------------------");
        }
    }

    public void spremiPodatkeUDatoteku(String datoteka) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(datoteka))) {
            for (Vozilo vozilo : vozila) {
                writer.write(vozilo.CSVZapis() + "\n");
            }
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) throws IOException, NeispravniPodaciException {
        BufferedReader reader = new BufferedReader(new FileReader(datoteka));
        String linija;

        while ((linija = reader.readLine()) != null) {
            String[] podaci = linija.split(",");

            String tipVozila = podaci[0];
            String registarskiBroj = podaci[1];
            String marka = podaci[2];
            int godinaProizvodnje = Integer.parseInt(podaci[3]);

            if (tipVozila.equals("Automobil")) {
                int brojVrata = Integer.parseInt(podaci[4]);
                Automobil automobil = new Automobil(registarskiBroj, marka, godinaProizvodnje, brojVrata);
                dodajVozilo(automobil);
            } else if (tipVozila.equals("Motocikl")) {
                String tipMotora = podaci[4];
                Motocikl motocikl = new Motocikl(registarskiBroj, marka, godinaProizvodnje, tipMotora);
                dodajVozilo(motocikl);
            }
        }
        reader.close();
    }

    /*
    @Override
    public String toString() {
        return "EvidencijaVozila{" +
                "vozila=" + vozila +
                '}';
    }*/
}
