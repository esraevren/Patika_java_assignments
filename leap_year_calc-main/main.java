package ornek_31;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Yıl giriniz:");
	 int year;
	 year=scanner.nextInt();
	

     if (year % 100 == 0) {
         if (year % 400 == 0) {
             System.out.println(year + " artık yıldır.");
         } else
             System.out.println(year + " artık yıl değildir.");
     } else if (year % 4 == 0) {
         System.out.println(year + " artık yıldır.");
     } else
         System.out.println(year + " artık yıl değildir.");
	 
}
}
