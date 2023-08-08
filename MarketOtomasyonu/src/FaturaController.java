public class FaturaController {

    private FaturaView faturaView;
    private FaturaModel faturaModel;

    public FaturaController(FaturaModel faturaModel, FaturaView faturaView){
        this.faturaModel=faturaModel;
        this.faturaView=faturaView;
    }

    public String getUrunAdi() {
        return faturaModel.getUrunAdi();
    }


    public double getUrunFiyati() {
        return faturaModel.getUrunFiyati();
    }


    public String getMusteriAdi() {
        return faturaModel.getMusteriAdi();
    }


    public String getMusteriEmail() {
        return faturaModel.getMusteriEmail();
    }

    public int getMiktar() {
        return faturaModel.getMiktar();
    }



    public double getVergiOrani(){
        return faturaModel.getVergiOrani();
    }

    public double getFaturaToplami() {
        return faturaModel.getFaturaToplami();
    }
    public void setVergiOrani(double vergiOrani){
        faturaModel.setVergiOrani(vergiOrani);
    }
    public void setUrunAdi(String urunAdi){
        faturaModel.setUrunAdi(urunAdi);
    }
    public void setUrunFiyati(double urunFiyati) {
        faturaModel.setUrunFiyati(urunFiyati);
    }

    public void setMusteriAdi(String musteriAdi) {
        faturaModel.setMusteriAdi(musteriAdi);
    }

    public void setMusteriEmail(String musteriEmail) {
        faturaModel.setMusteriEmail(musteriEmail);
    }

    public void setFaturaToplami(double faturaToplami) {
        faturaModel.setFaturaToplami(faturaToplami);
    }

    public void setMiktar(int miktar) {
        faturaModel.setMiktar(miktar);
    }

    public double tutarHesapla(){
        return faturaModel.getUrunFiyati()+faturaModel.getUrunFiyati()*faturaModel.getVergiOrani();
    }

    public void faturaGoruntule(){
        faturaView.faturaGoruntule(faturaModel.getUrunAdi(), faturaModel.getUrunFiyati(), faturaModel.getMusteriAdi(), faturaModel.getMusteriEmail(), faturaModel.getVergiOrani());
        System.out.println("Fatura toplamı vergiler dahil: " + tutarHesapla() );
    }





}
