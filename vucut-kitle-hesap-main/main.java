package ornek_16;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double boy,kilo,vki;
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
		
		boy=scanner.nextDouble();
		
		System.out.print("Lütfen kg cinsinden kilonuzu giriniz:");
		
		kilo=scanner.nextDouble();
		
    //Formül=Kilo (kg) / Boy(m) * Boy(m)
		vki=kilo/(boy*boy);
		
		System.out.println("Vücut Kitle İndeksiniz:"+ vki);
		
		System.out.println(vki>=30 ? "Obez" : "Obez değil");
		
	}
}
