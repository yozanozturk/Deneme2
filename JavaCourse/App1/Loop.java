package App1;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++){
			
			System.out.println(i);
		}
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("kaç adet sayı girmek istersiniz");
	int sayiAdeti = scanner.nextInt();
	int maksDeger = Integer.MIN_VALUE;
	
	for (int i=0; i < sayiAdeti ; i++ ) {
		System.out.println(String.format("%s sayı g2iriniz", i +1));
		int sayi =scanner.nextInt();
		
		if(maksDeger <sayi) {
			maksDeger = sayi;
		}
		

	}

	System.out.println (" maksDeger : " + maksDeger );
	
	}

}
