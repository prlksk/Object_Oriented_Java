
package javaapplication4;

public class Abone {
       public String isim;
       public int bakiye;
       public String sehir;
       
       public void dogalgazkullan(int miktar){
           if(this.bakiye< miktar){
               System.out.println("Yeterli miktarda bakiyeniz yok yeni bakiye yükleyiniz...");
           }          
           else{
            this.bakiye=-miktar;
            if(this.bakiye<=0){
                System.out.println("Bakiye bitti yeni bakiye yükle. Bakiye limiti 120tl dir");
            }
            else{
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }
       }
       }
      
      public void bakiyeogren(){
               System.out.println("Bakiyeniz =" + this.bakiye);
           }   
       
}


