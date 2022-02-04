package ornek_37;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
     
	 int min=0,max=0; 
	 Scanner scanner=new Scanner(System.in);

	 System.out.print("Kaç tane sayı gireceksiniz: ");
	 int n=scanner.nextInt();
	 
	 if(n<=1) {
		 System.out.println("Girdiğiniz sayı yetersiz.Lütfen daha fazla sayı giriniz");
         
	 }else {
		  
	 for(int i=1;i<=n;i++) {
		 System.out.print(i+". sayıyı giriniz:");
		 int number=scanner.nextInt();
		 if (i==1) {
			 min=number;
			 max=number;
			
		 }else {
			 if(number>=max) {
				 max=number;
			 }else {
				 min=number;
			 }
			 System.out.println("En küçük sayı: " + min);
		     System.out.println("En büyük sayı:" + max);
	      } 	
	  
	      }
	    }

  }
}


