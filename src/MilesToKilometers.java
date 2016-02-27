import java.util.Scanner;

public class MilesToKilometers {
  public static void main(String[] args){
    int miles = 1;
    System.out.println("Miles         Kilometers");
    
    while (miles <= 10){
      double kilometers = miles * 1.609;  
      System.out.printf(miles + "             %.3f \n", kilometers);
      miles++;
    } // while
    
  } // main 
} // MilesToKilometers
