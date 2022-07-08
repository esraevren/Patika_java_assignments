package ornek_21;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int heat;
		System.out.print("Hava sıcaklığını giriniz:");
		heat=scanner.nextInt();
		
		if (heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}else if (heat>=5 && heat<=25) {
			if (heat>=5 && heat<=15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if (heat>=15 && heat<=25) {
				System.out.println("Piknik yapabilirsiniz.");
			}
		}else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
		
		
	}
}
