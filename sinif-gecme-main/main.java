package ornek_20;

import java.util.Scanner;

public class Driver {
      
	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, muzik;
		
		System.out.print("Matematik notunuzu giriniz:");
		Scanner scanner =new Scanner(System.in);
		mat=scanner.nextInt();
		int ders1=(mat>=0 && mat<100)? mat : 0;
		
		System.out.print("Fizik notunuzu giriniz:");
		fizik=scanner.nextInt();
		int ders2=(fizik>=0 && fizik<100)? fizik : 0;
		
		System.out.print("Kimya notunuzu giriniz:");
		kimya=scanner.nextInt();
		int ders3=(kimya>=0 && kimya<100)? kimya : 0;
		
		System.out.print("Türkçe notunuzu giriniz:");
		turkce=scanner.nextInt();
		int ders4=(turkce>=0 && turkce<100)? turkce : 0;
		
		System.out.print("Müzik notunuzu giriniz:");
		muzik=scanner.nextInt();
		int ders5=(muzik>=0 && muzik<100)? muzik : 0;
		
		double ortalama;
		ortalama= (ders1+ders2+ders3+ders4+ders5)/5;
		
		  if (ortalama >= 55) {
	            System.out.println("Not ortalamaniz: " + ortalama + " ile gectiniz.");
	        }
	        else {
	            System.out.println("Not ortalamaniz: " + ortalama + " ile kaldiniz.");
	        }
		
	}
}
