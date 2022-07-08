package ornek_13;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		int kenar1,kenar2,kenar3;
		System.out.print("1.Kenarı girin:");
		kenar1=scanner.nextInt();
		
		System.out.print("2.Kenarı girin:");
		kenar2=scanner.nextInt();
		
		System.out.print("3.Kenarı girin:");
		kenar3=scanner.nextInt();
		
		//değişkenler tanımlandı
		double u, cevre,alan1;
		
		//çevre formulü
		u=(kenar1+kenar2+kenar3)/2.0;
		cevre=2.0*u;
		
		//alan formulü
		alan1=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
		System.out.println("Üçgenin alanı:"+Math.sqrt(alan1)+" cm'dir.");
		System.out.println("Üçgenin çevresi:"+ cevre+ " cm'dir.");
		
				
		
		
	}
}
