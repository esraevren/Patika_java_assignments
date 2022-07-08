package ornek_26;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	System.out.println("1.Sayıyı giriniz(a):");
	a=scanner.nextInt();
	
	System.out.println("2.Sayıyı giriniz(b):");
	b=scanner.nextInt();
	
	System.out.println("3.Sayıyı giriniz(c):");
	c=scanner.nextInt();
	
	if(a<b && a<c) {
		if(b<c) {
			System.out.println("En küçük sayı a");
		}else if (c<b) {
			System.out.println("En küçük sayı a");
		}else  
			System.out.println("En küçük sayı a");
		
	}else if (b<a && b<c) {
		if (a<c) {
		    System.out.println("En küçük sayı b");	
		}else if (c<a) {
			System.out.println("En küçük sayı b");
		}else
			System.out.println("En küçük sayı b");
		
	}else if (c<a && c<b) {
		if(a<b) {
			System.out.println("En küçük sayı c");
		}else if(b<a) {
			System.out.println("En küçük sayı c");
		}else
			System.out.println("En küçük sayı c");
		
	}else if (a==b && a<c) {
		System.out.println("En küçük sayı a ve b");
	}else if (a==c && a<b) {
		System.out.println("En küçük sayı a ve c");
	}else if (b==c && b<a) {
		System.out.println("En küçük sayı b ve c");
	}else
		System.out.println("Sayılar eşittir.");
		
}
}
