package ornek_38;
import java.util.Scanner;

public class Driver {
	
  public static void main(String[] args) {
	    int number;

       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(number-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
  }
