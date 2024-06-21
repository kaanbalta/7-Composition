public class Anakart {

    private String model;
    private String isletimSistemi;
    private int yuvaSayısı;
    private String uretici;

    public Anakart(String model, String isletimSistemi, int yuvaSayısı, String uretici) {
        this.model = model;
        this.isletimSistemi = isletimSistemi;
        this.yuvaSayısı = yuvaSayısı;
        this.uretici = uretici;
    }

    public void isletimSistemiYukle(String isletimSistemi){
        this.isletimSistemi = isletimSistemi;
        System.out.println("İşletim sistemi yüklendi : " + isletimSistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

    public int getYuvaSayısı() {
        return yuvaSayısı;
    }

    public void setYuvaSayısı(int yuvaSayısı) {
        this.yuvaSayısı = yuvaSayısı;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
}
