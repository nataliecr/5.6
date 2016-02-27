import java.util.Scanner;

public class MilesToKilometers {
  public static void main(String[] args){
    int miles = 1;
    int kilometers2 = 20;
    System.out.print("Miles         Kilometers | ");
    System.out.println("Kilometers         Miles");
    
    while (miles < 11 && kilometers2 < 66){
      double kilometers = miles * 1.609;  
      System.out.printf(miles + "%23.3f | "
              , kilometers);
      double miles2 = kilometers2 / 1.609;
      System.out.printf(kilometers2 + "%23.3f\n", miles2);
      kilometers2 += 5;  
      miles++;
    } // while
    
  } // main 
} // MilesToKilometers
