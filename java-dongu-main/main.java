package ornek_32;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	
 Scanner scanner=new Scanner(System.in);
 System.out.print("Sayı giriniz:");
 int k,counter=0,toplam=0;
 k=scanner.nextInt();
 
 for(int i=0;i<k;i++) {
	 if(i%3==0 && i%4==0) {
		 counter++;
		 toplam=toplam+i;
		 System.out.println(i+",");
	 }
	 
 }
 
 
 System.out.println("Ortalama:"+toplam/counter);
		
}
}
