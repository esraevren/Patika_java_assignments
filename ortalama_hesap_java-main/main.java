package ornek_9;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
    //değişkenler tanımlandı
		int mat, fizik, kimya, muzik, tarih, turkce;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Matematik notunuz:");
		mat=scanner.nextInt();
		
		System.out.print("Fizik notunuz:");
		fizik=scanner.nextInt();
		
		System.out.print("Kimya notunuz:");
		kimya=scanner.nextInt();
		
		System.out.print("Müzik notunuz:");
		muzik=scanner.nextInt();
		
		System.out.print("Tarih notunuz:");
		tarih=scanner.nextInt();
		
		System.out.print("Türkçe notunuz:");
		turkce=scanner.nextInt();
		
		int toplam;
		double ortalama;
		toplam= mat + fizik + kimya + muzik + tarih + turkce;
		ortalama=toplam/6;
		
		System.out.println("Not ortalamanız:"+ ortalama);
		
		/* eğer kullanıcının ortalaması  60'dan büyük ise ekrana "Sınıfı Geçti" 
		küçük ise "Sınıfta Kaldı" yazsın.*/
		
		System.out.println(ortalama>60 ? "Sınıfı Geçti": "Sınıfta Kaldı" );
		
		
	}
}
