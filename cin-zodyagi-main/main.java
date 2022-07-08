package ornek_30;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Doğum tarihinizi giriniz:");
	int year,burc;
	year=scanner.nextInt();
	
	burc=year%12;
	
	switch(burc) {
	case 0:
		System.out.println("maymun");
	   break;
	case 1:
		System.out.println("horoz");
	break;
	case 2:
		System.out.println("köpek");
		break;
	case 3:
		System.out.println("domuz");
		break;
	case 4:
		System.out.println("fare");
		break;
	case 5:
		System.out.println("öküz");
		break;
	case 6:
		System.out.println("kaplan");
		break;
	case 7:
		System.out.println("tavşan");
		break;
	case 8:
		System.out.println("ejderha");
		break;
	case 9:
		System.out.println("yılan");
		break;
	case 10:
		System.out.println("at");
		break;
	case 11:
		System.out.println("koyun");
		break;
	
	}
}
}
