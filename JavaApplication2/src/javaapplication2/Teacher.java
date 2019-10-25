package javaapplication2;

public class Teacher extends Personel {
    
    private String subject;   

    public Teacher(int id,String name, String job, int schoolbus, boolean salary, String subject) {
        super(id, name, job, schoolbus, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void show() {
        super.show(); 
        System.out.println( "Hangi dersin öğretmeni: "+ subject);//To change body of generated methods, choose Tools | Templates.
    }
}
