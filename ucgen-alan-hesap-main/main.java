package ornek_15;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazın
		double pi=3.14,alan,r,a;
		System.out.print("Yarıçapı Giriniz:");
		r=scanner.nextDouble();
		System.out.print("Merkez açının ölçüsünü giriniz:");
		a=scanner.nextDouble();
		//Formül : (𝜋 * (r*r) * 𝛼) / 360
		alan=(pi * (r*r) * a) / 360;
		System.out.println("Daire diliminin alanı:"+alan);
		
	}
