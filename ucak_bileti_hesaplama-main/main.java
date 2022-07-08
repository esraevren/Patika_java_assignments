package ornek_28;

import java.util.Scanner;

public class Driver {
 
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int km,yas,tip;
		double fiyat;
		System.out.print("Mesafeyi km cinsinden giriniz:");
		km=scanner.nextInt();
				
		System.out.print("Yaşınızı giriniz:");
		yas=scanner.nextInt();
		
		System.out.print("Yolculuk tipinizi giriniz\n1.Tek yön\n2.Gidiş-dönüş");
		tip=scanner.nextInt();
		
		fiyat=km*0.1;
		
		if(yas>0 && km>0 && tip==1|tip==2) {
			if(yas<12) {
				if(tip==2) {
					   fiyat=fiyat*0.5;
					   fiyat=fiyat-(fiyat*0.2);
					   fiyat=fiyat*2;
					   System.out.println("Bilet fiyatınız:"+fiyat);
					}else {
						fiyat=fiyat*0.5;
						System.out.println("Bilet fiyatınız:"+fiyat);
					}

			}else if(yas>=12 && yas<24) {
				if(tip==2) {
					fiyat=fiyat-(fiyat*0.1);
					fiyat=fiyat-(fiyat*0.2);
					fiyat=fiyat*2;
					System.out.println("Bilet fiyatınız:"+fiyat);
				}else {
					fiyat=fiyat-(fiyat*0.1);
					System.out.println("Bilet fiyatınız:"+fiyat);
					}

			}else if(yas>=24 && yas<=65) {
				if(tip==2) {
					fiyat=fiyat*2;
					System.out.println("Bilet fiyatınız:"+fiyat); 
				}else {
					System.out.println("Bilet fiyatınız:"+fiyat);
				}
			}else if(yas>65) {
				if(tip==2) {
					fiyat=fiyat-(fiyat*0.3);
					fiyat=fiyat-(fiyat*0.2);
					fiyat=fiyat*2;
					System.out.println("Bilet fiyatınız:"+fiyat);
				}else {
					fiyat=fiyat-(fiyat*0.3);
					System.out.println("Bilet fiyatınız"+fiyat);
				}
			}

			
		}else {
			System.out.println("Hatalı veri girişi yaptınız !");
		}
		
	}}
