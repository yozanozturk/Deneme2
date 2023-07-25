package App1;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		boolean asalMi = true ;
		
		System.out.println("bir sayı girin");
		
		int sayi = scanner.nextInt();
		
		if (sayi <=1) 
			asalMi = false;
			
			else {
				for (int i= 2; i  <= Math.sqrt(sayi); i++) {
					if(sayi % i == 0) {
						asalMi = false;
						break;
			
						}
				
			}
		}
		
		if (asalMi) {
			System.out.println("asaldır");
		}
		else {
			
			System.out.println("asal değil");
		}
		
		String sonuc = asalMi ? "asaldır" : "asal değildir";
		
		System.out.println(String.format("sayımız %s" , sonuc ));

	}

}
