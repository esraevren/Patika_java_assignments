package ornek_34;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Sayı giriniz:");
	int sayi;
	double harmonic,toplam=0;
	
	sayi=scanner.nextInt();
	
	
	for(int i=1;i<=sayi;i++) {
		harmonic=(1.0)/i;
		toplam=toplam+harmonic;
	}
	
	System.out.println("sonuç:"+toplam);
}
}
