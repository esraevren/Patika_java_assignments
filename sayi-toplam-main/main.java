package ornek_37;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
		
		
		
		int toplam=0;
		
		while(true) {
			System.out.print("Sayı giriniz:");
			int number=scanner.nextInt();
			if(number !=0 ) {
				toplam=toplam+number;
			}else {
				System.out.println("Sayıların toplamı:"+toplam);
			}
			
		}
		
	}

}
