import java.util.Scanner;

public class MilesToKilometers {
  public static void main(String[] args){
    int miles = 1;
    int kilometers2 = 20;
    System.out.printf("%-10s%15s", "Miles", "Kilometers");
    System.out.print(" | ");
    System.out.printf("%-9s%15s\n", "Kilometers", "Miles");
    
    while (miles <= 10 && kilometers2 <= 65){
      double kilometers = miles * 1.609;  
      //System.out.printf(miles + "%24.3f | "
              //, kilometers);
      System.out.printf("%-5d%15.3f ", miles, kilometers);
      System.out.print("     | ");
      double miles2 = kilometers2 / 1.609;
      //System.out.printf(kilometers2 + "%24.3f\n", miles2);
      System.out.printf("%-12d%14.3f\n", kilometers2, miles2);
      kilometers2 += 5;  
      miles++;
    } // while
    
  } // main 
} // MilesToKilometers
