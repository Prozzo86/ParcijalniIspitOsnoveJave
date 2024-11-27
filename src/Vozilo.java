abstract class Vozilo implements VoziloService {
    private String registarskiBroj;
    private String marka;
    private int godinaProizvodnje;

    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje <= 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivna.");
        }
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje <= 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivna.");
        }
        this.godinaProizvodnje = godinaProizvodnje;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Registarski broj: " + registarskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }

    public abstract String CSVZapis();
}
