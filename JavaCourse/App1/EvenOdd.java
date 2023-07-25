package App1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		if(sayi % 2 == 1) {
			System.out.println("sayımız çifttir");
		
		} else {
			System.out.println("sayımız tektir.");
		}
		}

}
