package ornek_33;

import java.util.Scanner;

public class Driver {
 
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int i,k,n,total = 1;
		System.out.print("Sayı giriniz:");
		k=scanner.nextInt();
		System.out.print("Üssü giriniz:");
		n=scanner.nextInt();
		
		//3^4 k*k*k...n tane 
		
	
		for(i=1;i<=n;i++) {
			total=total*k;
			
			
		}
		
		System.out.print("Sonuç:"+total);
	}
	
	
}
