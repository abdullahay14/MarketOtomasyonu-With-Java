public class FaturaView {

    void faturaGoruntule(String urunAdi, double urunFiyati, String musteriAdi, String musteriEmail, double vergiOrani){
        System.out.println("\nFatura Bilgileri:");
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("Ürünlerin toplam Fiyatı: " + urunFiyati);
        System.out.println("Müşteri Adı: " + musteriAdi);
        System.out.println("Müşteri Email: " + musteriEmail);
        System.out.println("Ürünlerden alınacak vergi oranı:"+ vergiOrani);

    }
}
