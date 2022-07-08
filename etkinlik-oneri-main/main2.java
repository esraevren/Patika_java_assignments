package ornek_23;

import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int heat,i;
	System.out.print("Hava sıcaklığını giriniz:");
	heat=scanner.nextInt();
	if(heat<5) {
		i=1;
	}else if(heat>=5 && heat<=15) {
		i=2;
	}else if(heat>=15 && heat<=25) {
		i=3;
	}else {
		i=4;
	}
		
	
	switch(i) {
	case 1:
		System.out.println("Kayak");
		break;
	case 2:
	    System.out.println("Sinema");
	    break;
	case 3:
	    System.out.println("Piknik");
	    break;
	case 4:
	    System.out.println("Yüzme");
	    break;
		
	}
}
}
