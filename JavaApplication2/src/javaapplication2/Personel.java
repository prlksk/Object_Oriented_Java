
package javaapplication2;

public class Personel {
    private int id;
    private String name;
    private String job;
    private int schoolbus;
    private boolean salary;

    public Personel(int id, String name, String job, int schoolbus, boolean salary) {
			this.name= name;
			this.job= job;
			this.schoolbus= schoolbus;
			this.salary= salary;
                        this.id=id;
			
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSchoolbus() {
        return schoolbus;
    }

    public void setSchoolbus(int schoolbus) {
        this.schoolbus = schoolbus;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }
    public void show() {
	         System.out.println("name: "+ getName());
	        System.out.println("Job: "+ getJob());
	        System.out.println("Schoolbus Number: "+ getSchoolbus());
  
	        System.out.println("Does she/he have a salary?: "+ isSalary());
}
   
    
}

