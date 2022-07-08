package ornek_18;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		int n1, n2, select;
		System.out.print("Birinci tam sayıyı girin:");
		Scanner scanner=new Scanner(System.in);
		n1=scanner.nextInt();
		
		System.out.print("İkinci tam sayıyı girin:");
		n2=scanner.nextInt();
		
		System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\nİşlemi seçiniz:");
		select=scanner.nextInt();
		
		switch (select) {
		 case 1:
			 System.out.print(n1+n2);
			 break;
		 case 2:
			 System.out.print(n1-n2);
			 break;
		 case 3:
			 System.out.print(n1*n2);
			 break;
		 case 4:
		 if (n2 != 0) {
       //ikinci sayı sıfırdan farklı olmalıdır.
			 System.out.print(n1/n2);
		 }else
       //ikinci sayı 0 ise uyarı verilecektir
			 System.out.print("Sayılar 0'a bölünemez");
			 break;
		 default:
        //4 seçenek dışında seçim yapıldığında uyarı
		     System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz.");
		 
			 
		
	   }
		
	}

}
