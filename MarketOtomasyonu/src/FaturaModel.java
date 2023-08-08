public class FaturaModel implements IUrunBilgisi, IMusteriBilgisi{
    public double vergiOrani = 0.19;

    private double faturaToplami;
    private String urunAdi;
    private double urunFiyati;
    private int miktar;
    private String musteriAdi;
    private String musteriEmail;

    public FaturaModel(){}

    public FaturaModel(String urunAdi, double urunFiyati, int miktar, String musteriAdi, String musteriEmail) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.miktar = miktar;
        this.musteriAdi = musteriAdi;
        this.musteriEmail = musteriEmail;
    }

    @Override
    public String getUrunAdi() {
        return urunAdi;
    }

    @Override
    public double getUrunFiyati() {
        return urunFiyati * miktar;
    }

    @Override
    public String getMusteriAdi() {
        return musteriAdi;
    }

    @Override
    public String getMusteriEmail() {
        return musteriEmail;
    }

    public int getMiktar() {
        return miktar;
    }

    public double getVergiOrani(){
        return vergiOrani;
    }

    public double getFaturaToplami() {
        return faturaToplami;
    }
    public void setVergiOrani(double vergiOrani) {
        this.vergiOrani = vergiOrani;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setUrunFiyati(double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public void setMusteriEmail(String musteriEmail) {
        this.musteriEmail = musteriEmail;
    }

    public void setFaturaToplami(double faturaToplami) {
        this.faturaToplami = faturaToplami;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
}
