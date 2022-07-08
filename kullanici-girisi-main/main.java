package ornek_19;

import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
	  
	Scanner scanner = new Scanner(System.in);
	String userName,password;
	
	System.out.print("Kullanıcı adınızı giriniz:");
	userName=scanner.nextLine();
	
	System.out.print("Şifrenizi giriniz:");
	password=scanner.nextLine();
	
	//kullanıcı adı patika password java123 
	
	if(userName.equals("patika") && password.equals("java123")) {
		System.out.println("Giriş Yaptınız!");
	}else {
		System.out.println("Şifreniz yanlış!");
		System.out.println("Şifrenizi değiştirmek ister misiniz?");
		System.out.println("1.Şifremi sıfırla\n2.İstemiyorum");
	}
	
	int sifreSelect;
	sifreSelect=scanner.nextInt();
	switch (sifreSelect) {
	case 1:
		System.out.print("Yeni şifrenizi giriniz:"+ scanner.nextLine() );
		String yeniSifre=scanner.nextLine();
		
		if (yeniSifre.equals("java123")) {
			System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
		}else {
			System.out.println("Şifreniz oluşturuldu.");
			
		}
		
	break;
	
	case 2:
		System.out.println("Sisteme giriş başarısız");
	
	
	
	  }
  }
}
