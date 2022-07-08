package ornek_10;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		double fiyat;
   
		System.out.println("Fiyatı giriniz:");
		fiyat=scanner.nextDouble();
		
		
		/*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
		 *  tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplamaktadır. */
		
		System.out.println(fiyat>0 && fiyat<1000 ? "KDV'li fiyat:"+(fiyat+fiyat*0.18) :"KDV'li fiyat:"+ (fiyat+fiyat*0.08) );
		
		
	
	}

}
