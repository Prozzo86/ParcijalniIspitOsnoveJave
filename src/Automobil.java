class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan.");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata);
    }

    @Override
    public String CSVZapis() {
        return "Automobil ima registraciju: " + getRegistarskiBroj() + ", marka auta je: " + getMarka() + ", godina proizvodnje: " +
                getGodinaProizvodnje() + ", a broj vrata:" + brojVrata;
    }
}
