package ornek_38;
import java.util.Scanner;

public class Driver {
	
  public static void main(String[] args) {
	    int number;

       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = scanner.nextInt();

        for(int i=number ; i>0 ; i--) {
			for(int j=0 ;j<i ; j++) {
			System.out.print("*");
		}
			System.out.println();

	}


}

    }
  
