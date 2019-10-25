package javaapplication4;


public class Advanced_abone {
       private String isim;
       private int bakiye;
       private String sehir;
       
    public Advanced_abone(String isim, String sehir, int bakiye) {
        this.isim = isim;
        this.sehir = sehir;
        if (bakiye>=0 && bakiye<=120){
            this.bakiye=bakiye;
        }
        else{
            System.out.println(" 120 tlden büyük bakiye ile abonelik açamazsınız.");
            this.bakiye= 120;
        }
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
      
    public void dogalgazkullan(int miktar){
        if(this.bakiye< miktar){
            System.out.println("Yeterli miktarda bakiyeniz yok yeni bakiye yükleyiniz lütfen.");
        }
        else{
            this.bakiye=-miktar;
            if(this.bakiye<=0){
                System.out.println("Bakiye bitti, kredi yükle. Limit 120tl dir.");
            }
            else{
                System.out.println("Yeni bakiyeniz" +this.bakiye);
            }
        }
    }
    public void bakiyeogren(){
        System.out.println("Bakiyeniz:" +bakiye);
    }
}
