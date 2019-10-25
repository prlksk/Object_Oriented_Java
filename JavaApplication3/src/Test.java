
public class Test {
    public static void main(String[] args){
        Resolution resolution = new Resolution(1920,1980);
        Monitor monitor = new Monitor( "Gtx","Nvidia","18.5 inch",resolution);
        Kasa kasa = new Kasa("ven","asus","alm");
        Anakart anakart = new Anakart("B23","Microsoft",16,"linux");
        
        bilgisayar pc = new bilgisayar( monitor, kasa, anakart);
        
        pc.getMonitor().monitoru_kapat();
        pc.getKasa().openpc();
        pc.getAnakart().isletim_sistemi_yukle("Kali");
    }
    
}
