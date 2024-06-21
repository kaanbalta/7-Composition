public class Test {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS1908SE","Asus","18.5",resolution);
        Kasa kasa = new Kasa("SHadow balde","shadow","cam");
        Anakart anakart = new Anakart("b250pro","win10",10,"Asus");

        Bilgisayar bilgisayar = new Bilgisayar(monitor,kasa,anakart);

        bilgisayar.getKasa().pcyiAc();
        bilgisayar.getMonitor().monitoruKapat();
        bilgisayar.getAnakart().isletimSistemiYukle("win11");



    }
}
