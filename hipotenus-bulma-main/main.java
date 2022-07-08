package ornek_11;

import java.util.Scanner;

public class Driver {
    
	public static void main(String[] args) {
	
	 /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan 
	  * ve hipotenüsü hesaplayan program */
	  
	
	int kenar1, kenar2;
	double hipotenus ;
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Birinci kenar uzunluğunu girin:");
	kenar1=scanner.nextInt();
	
	System.out.print("İkinci kenar uzunluğunu girin:");
	kenar2=scanner.nextInt();
	
	hipotenus=(kenar1*kenar1)+(kenar2*kenar2) ;
	
	System.out.print("Hipotenüs uzunluğu:"+Math.sqrt(hipotenus));
	
	
	
}
}
