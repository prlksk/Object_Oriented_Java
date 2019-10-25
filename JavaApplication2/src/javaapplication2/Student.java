
package javaapplication2;

public class Student extends Personel {
    private String sinif;

    public Student(int id, String name, String job, int schoolbus, boolean salary,String sinif) {
        super(id, name, job, schoolbus, salary);
        this.sinif = sinif;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Sınıfı: "+ sinif);//To change body of generated methods, choose Tools | Templates.
    }
}
