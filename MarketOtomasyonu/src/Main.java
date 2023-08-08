public class Main {
    public static void main(String[] args) {
        Sepet_View sepet_view = new Sepet_View();
        Sepet_Model sepet_model = new Sepet_Model();
        Sepet_Controller sepet_controller = new Sepet_Controller(sepet_model, sepet_view);

        sepet_controller.setUrunAdi("Togg");
        sepet_controller.setUrunFiyati(1000000);
        sepet_controller.setMusteriAdi("Sherlock");
        sepet_controller.setMusteriEmail("sherlock.@gmail.com");

        sepet_controller.sepetGoruntule();

        FaturaView faturaView = new FaturaView();
        FaturaModel faturaModel = new FaturaModel();
        FaturaController faturaController = new FaturaController(faturaModel, faturaView);

        faturaController.setUrunAdi("Togg");
        faturaController.setUrunFiyati(1000000);
        faturaController.setMusteriAdi("Abdullah");
        faturaController.setMusteriEmail("Abdullah.ay1414@gmail.com");
        faturaController.setMiktar(5);
        //faturaController.setVergiOrani(0.20);// default değer=0.18
        faturaController.faturaGoruntule();

    }
}
