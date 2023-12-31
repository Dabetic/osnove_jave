package d12_09_2023;

//Kreirati klasu Ringla koja ima:
//●	tip ringle (obicna ili ekspres)
//●	jacinu
//○	za obicnu ringu jacina je u opsegu od 0 do 3
//○	za ekspres ringlu jacina je u opsegu od 0 do 12
//●	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//●	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//●	getter za jacinu
//●	setteri ne postoje!!
//●	privatnu metodu koja vraca maksimalan broj pojacavanja
//○	za obicnu je 3, za ekspres je 12
//●	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//●	metodu iskljuci ringlu - metoda postavlja jacinu na 0
//●	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//●	metodu koja vraca potrosnju elektricne energije prema formuli
//○	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
//○	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//●	metodu koja stampa podatke u formatu:
//	Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW

public class Ringla {

    private String tipRingle;
    private int jacina;
    private int jacinaGrejacaKw;

    public Ringla(String tipRingle, int jacinaGrejacaKw) {
        this.tipRingle = tipRingle;
        this.jacinaGrejacaKw = jacinaGrejacaKw;
    }

    public int getJacina() {
        return jacina;
    }

    private int maxJacina() {

        if (tipRingle.equals("obicna")) {
            return 3;
        }
        if (tipRingle.equals("ekspres")) {
            return 12;
        }
        return 0;
    }

    public void pojacajRignlu() {
        this.jacina += 1;
        if(this.jacina > maxJacina()) {
            this.jacina = maxJacina();
        }
    }

    public int iskljuciRinglu() {
        return this.jacina = 0;
    }

    public void daLiJeRinglaIskljucena() {
        if (this.jacina <= 0) {
            System.out.println("Ringla je iskljucena");
        } else {
            System.out.println("Ringla je ukljucena");
        }
    }

//    public int vremeRadaRingle (int vremeRadaRingle) {
//        return vremeRadaRingle;
//    }

    public int racunanjePotrosnje(int vremeRadaRignle) {
        return 100 / maxJacina() * jacina * jacinaGrejacaKw * vremeRadaRignle;
    }

    public void stampanje () {
        daLiJeRinglaIskljucena();
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Jacina ringle: " + this.jacina);
        System.out.println("Jacina grejaca: " + this.jacinaGrejacaKw + " KW");
    }

}
