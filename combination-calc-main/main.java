package ornek_32;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	
 Scanner scanner=new Scanner(System.in);
 int i,k,n,r,comb,total1=1,total2=1,total3=1;
 System.out.println("1.Sayıyı giriniz:");
 n=scanner.nextInt();
 System.out.println("2.Sayıyı giriniz:");
 r=scanner.nextInt();
 
 //n! r! k!(n-r) bulma
 
 for(i=1;i<=n;i++) {
	 total1=total1*i 
   }
 
for(i=1;i<=r;i++) {
	total2=total2*i;
}

k=n-r;

for(i=1;i<=k;i++) {
	total3=total3*i;
}

//C(n,r) = n! / (r! * (n-r)!)

comb=total1/ (total2*total3);
System.out.print("Kombinasyon sonucu:"+comb);
		
}
}
