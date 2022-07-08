package ornek_41;

import java.util.Scanner;

public class FinalSinavi {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("1.sayıyı giriniz:");
	int n1=scanner.nextInt();
	System.out.print("2.sayıyı giriniz:");
	int n2=scanner.nextInt();
	
  //değişken tanımlaması yapıldı
	int i=1,j=1,ebob=1,ekok=1;
	
   //2. girilen sayının büyük olması durumunda
	if(n1<n2) {
		while(i<=n1) {
			if(n1%i==0 && n2%i==0) {
				ebob=i;
			}
				i++;
	    }
	//1. sayının büyük olması durumunda ebob max küçük sayı kadar olabilir
    
    }else {
    	while(i<=n2) {
			if(n1%i==0 && n2%i==0) {
				ebob=i;
			}
				i++;
	    }
    }
	
   // ekok en fazla sayıların çarpımı kadar olabilir.
	while(j<=n1*n2) {
		if(j%n1==0 && j%n2==0) {
			ekok=j;
			break;
		}
		j++;
	}
	System.out.println("ebob:"+ebob);
	System.out.println("ekok:"+ekok);
}
}
