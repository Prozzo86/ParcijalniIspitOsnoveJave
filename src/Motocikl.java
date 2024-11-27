class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String registarskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora: " + tipMotora);
    }

    @Override
    public String CSVZapis() {
        return "Motocikl ima registraciju: " + getRegistarskiBroj() + ", marka motocikla je: " + getMarka() + ", godina proizvodnje: " +
                getGodinaProizvodnje() + ", a tip motocikla je: " + tipMotora;
    }
}
