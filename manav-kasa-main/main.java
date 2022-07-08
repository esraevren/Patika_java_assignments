package ornek_17;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		double toplam,armut,elma,domts,muz,ptlcn;
		
		System.out.print("Armut kaç kilo?");
		armut=scanner.nextDouble();
		
		System.out.print("Elma kaç kilo?");
		elma=scanner.nextDouble();
		
		System.out.print("Domates kaç kilo?");
		domts=scanner.nextDouble();
		
		System.out.print("Muz kaç kilo?");
		muz=scanner.nextDouble();
		
		System.out.print("Patlıcan kaç kilo?");
		ptlcn=scanner.nextDouble();
		
		toplam=(armut*2.14)+(elma*3.67)+(domts*1.11)+(muz*0.95)+(ptlcn*5);
		System.out.println("Toplam Tutar:"+toplam+"TL");
		
		
		
	
	}

}
