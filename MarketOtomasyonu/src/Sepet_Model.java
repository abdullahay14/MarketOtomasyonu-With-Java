public class Sepet_Model implements IUrunBilgisi, IMusteriBilgisi{
    private String urunAdi;
    private double urunFiyati;
    private String musteriAdi;
    private String musteriEmail;

    public Sepet_Model(){

    }

    public Sepet_Model(String urunAdi, double urunFiyati, String musteriAdi, String musteriEmail) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.musteriAdi = musteriAdi;
        this.musteriEmail = musteriEmail;
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

    @Override
    public double getUrunFiyati() {
        return urunFiyati;
    }

    @Override
    public String getUrunAdi() {
        return urunAdi;
    }
    @Override
    public String getMusteriAdi() {
        return musteriAdi;
    }

    @Override
    public String getMusteriEmail() {
        return musteriEmail;
    }

}
