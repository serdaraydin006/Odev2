public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = new Ogrenci[]{
                new Ogrenci(null, null, "1973","104", 0.0, "001", 0),
                new Ogrenci("Gökhan", "Bilgisayar Müh.", "1985","104", 0.0, "001", 0),
                new Ogrenci("Ayşe", "Makina Müh.", "1985", "104", 0.0, "001", 2),
                new Ogrenci("Elif", "Elektrik Elektronik Müh", "2020","104",  1.98, "001",4)
        };
        System.out.println("Öğrenci Bilgileri");
        int ogrSira = 1;
        for(Ogrenci ogrenci : ogrenciler){
            System.out.println("OGR-" + ogrSira + " " + ogrenci.getAd() + " " + ogrenci.getBolum() + " " + ogrenci.getOgrNo() + " " + ogrenci.getGano());
            ogrSira++;
        }
        int ogrSiraa = 0;
        for (Ogrenci ogrenci : ogrenciler) {
            ogrSiraa++;
            if (ogrenci.getDersSayisi() != 0){
                System.out.println( ogrSiraa + ". öğrencinin ödeyeceği harç : " + ogrenci.getHarcHesapla() * 10);
            }
        }
    }
}
