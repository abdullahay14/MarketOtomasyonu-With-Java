public class Sepet_Controller {
    private Sepet_View sepet_view;
    private Sepet_Model sepet_model;

    public Sepet_Controller(Sepet_Model sepet_model, Sepet_View sepet_view) {
        this.sepet_model = sepet_model;
        this.sepet_view = sepet_view;
    }

    public void setUrunAdi(String urunAdi) {
        sepet_model.setUrunAdi(urunAdi);
    }

    public String getUrunAdi(){
        return sepet_model.getUrunAdi();
    }

    public void setUrunFiyati(double urunFiyati) {
        sepet_model.setUrunFiyati(urunFiyati);
    }

    public double getUrunFiyati(){
        return sepet_model.getUrunFiyati();
    }

    public void setMusteriAdi(String musteriAdi) {
        sepet_model.setMusteriAdi(musteriAdi);
    }
    public String getMusteriAdi(){
        return sepet_model.getMusteriAdi();
    }

    public void setMusteriEmail(String email) {
        sepet_model.setMusteriEmail(email);
    }
    public String getMusteriEmail(){
        return sepet_model.getMusteriEmail();
    }


    public void sepetGoruntule() {
        sepet_view.sepetGoruntule(sepet_model.getUrunAdi(), sepet_model.getUrunFiyati(), sepet_model.getMusteriAdi(), sepet_model.getMusteriEmail());
    }
}


