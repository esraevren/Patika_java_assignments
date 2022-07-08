package ornek_32;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	
 Scanner scanner=new Scanner(System.in);
 System.out.println("Sayı giriniz:");
 int k;
 k=scanner.nextInt();
 
 for(int i=1;i<=k;i*=4  ) {
	 
	 System.out.println(i);
 }
 for (int j =1; j<=k; j*=5){
     System.out.println(j);
 }
 

		
}
}
