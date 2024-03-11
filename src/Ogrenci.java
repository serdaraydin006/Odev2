public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    private String girisSira;
    private double harcHesapla;
    private int dersSayisi;
    private double yil;
    public Ogrenci(String ad, String bolum, String girisYili, String bolumKodu, double gano, String girisSira, int dersSayisi) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrenciNoOlustur(girisYili, bolumKodu, girisSira);
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.girisSira = girisSira;
        this.dersSayisi = dersSayisi;
        this.harcHesapla =  harcHesapla(dersSayisi, (int) yil);
    }
    //Constructor Overload
    public Ogrenci(String ad, String bolum, String girisYili, String bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrenciNoOlustur(girisYili, bolumKodu, girisSira);
        this.gano = gano;
        this.bolumKodu = bolumKodu;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String getGirisYili() {
        return girisYili;
    }
    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }
    public String getOgrNo() {
        return ogrNo;
    }
    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }
    public double getGano() {
        if (gano > 4 || gano < 0){
            throw new IllegalArgumentException("Ortalamayı yanlış girdiniz");
        }
        return gano;
    }
    public void setGano(double gano) {
        this.gano = gano;
    }
    public String getBolumKodu() {
        return bolumKodu;
    }
    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
    public String getGirisSira() {
        return girisSira;
    }
    public double getHarcHesapla() {
        return harcHesapla;
    }
    public void setHarcHesapla(double harcHesapla) {
        this.harcHesapla = harcHesapla;
    }
    public int getDersSayisi() {
        return dersSayisi;
    }
    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }
    public void setGirisSira(String girisSira) {
        this.girisSira = girisSira;
    }
    public double getYil() {
        return yil;
    }
    public void setYil(double yil) {
        this.yil = yil;
    }
    public String ogrenciNoOlustur(String girisYili, String bolumKodu, String girisSira){
        String ogrenciNo = girisYili+bolumKodu+girisSira;
    return ogrenciNo;
    }
    public double harcHesapla(int dersSayisi){
        double harc = dersSayisi * 24;
        return harc;
    }
    public double harcHesapla(int dersSayisi, int yil){
        double harc = dersSayisi * 24 + yil * 48;
        return harc;
    }
}