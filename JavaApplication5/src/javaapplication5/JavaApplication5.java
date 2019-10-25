package javaapplication5;

class Animal{
       private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void konus(){
        System.out.println("Hayvan konuşuyor");
    }
}
class Dog extends Animal{
    public Dog(String isim){
        super(isim);
    }
    public String konus() {
        return this.getIsim()+ " Havlıyor";
    }
}
class At extends Animal{
    public At(String isim){
        super(isim);
    }
    public String konus() {
        return this.getIsim()+ " Kişniyor";
    }
}
class Cat extends Animal{

    public Cat(String isim) {
        super(isim);
            
    }

    @Override
    public String konus() {
        return this.getIsim()+ " Miyavlıyor";
    }
    
     
}
public class JavaApplication5 {
    
    public static void main(String[] args) {
        Animal animal1= new Cat("kafkaf");
        Animal animal2 = new Dog("çıtçıt");
        Animal animal3 = new At("Morargarth");
        System.out.println(animal1.konus());
        System.out.println(animal2.konus());
        System.out.println(animal3.konus());
    }
    
}
