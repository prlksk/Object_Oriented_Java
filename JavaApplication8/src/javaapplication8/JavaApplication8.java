package javaapplication8;

import java.util.Scanner;


public class JavaApplication8 {


    public static void main(String[] args) {
    
      int[] d =make_array(5);
      print_array(d);
    }
    public static void  print_array(int[] array){
        
        for(int i=0; i<array.length; i++){
           System.out.println(array[i]);
        }
        
    }
    
    public static int[] make_array(int number){
        int[] c= new int[number];
        for(int i=0; i<number; i++){
            System.out.println(i + "'inci sayıyı giriniz:");
            Scanner scr= new Scanner(System.in);
            
            int element= scr.nextInt();
            c[i]=element;     
        }
        return c;
              
    }
    
}
