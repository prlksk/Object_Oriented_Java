/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author PIRIL_KSK
 */
public class main {
    public static void main(String[] args){
        Student student = new Student(12,"piril","student",19,false,"12ib");
        Teacher teacher = new Teacher(25,"Kürşat Bey","teacher",21, true ,"cs-math");
        
        student.show();
        teacher.show();
}
    
}

