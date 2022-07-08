package ornek_14;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
    
    //değişkenler tanımlandı.
		double baslangic, mesafe, ücret ;
    
    //Taksimetre açılış ücreti 10 TL'dir.
		baslangic=10;
    
		System.out.print("Gidilen mesafeyi girin:");
		mesafe=scanner.nextDouble();
		
    //Taksimetre KM başına 2.20 TL tutmaktadır.
		ücret=baslangic+ (mesafe*2.2);
    
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		System.out.println(ücret>20 ? "Taksimetre tutarı"+ücret+"TL'dir.":"Taksimetre tutarı"+ 20+"TL'dir" );
	}
}
