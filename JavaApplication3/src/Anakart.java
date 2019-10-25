public class Anakart {
   private String model;
   private String uretici;
   private int sloth;
   private String os;

    public Anakart(String model, String uretici, int sloth, String os) {
        this.model = model;
        this.uretici = uretici;
        this.sloth = sloth;
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getSloth() {
        return sloth;
    }

    public void setSloth(int sloth) {
        this.sloth = sloth;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public void isletim_sistemi_yukle(String os){
        this.os = os;
        System.out.println("İşletimsistemi yükleniyor: "+ os);
    }
    
}
