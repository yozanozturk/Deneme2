package App1;

import java.util.Scanner;

public class vizeFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner scanner = new Scanner(System.in);
	System.out.println("vize1 giriniz");
	int vize1 = scanner.nextInt();
	
	System.out.println("vize 2 giriniz");
	int vize2 = scanner.nextInt();
	
	System.out.println("final giriniz");
	int finalNotu = scanner.nextInt();
	
	
	if((vize1 < 0  || vize1 > 100 || vize2 < 0 ||vize2 > 100 || finalNotu <0 
			|| finalNotu > 100)) {
		
		System.out.println("not aralığı 0-100 olmalı");
		
		else { 
			double ortalama = ((vize1 + vize2 )* 0.2f) +(finalNotu * 0.6f);
			
			if(ortalama <= 50) {
				System.out.println ("FF"));
				
			} else if(ortalama > 50 && ortalama <=60) {
				System.out.println("CC");
				else if(ortalama >60 && ortalama <=80)
			}
		}
		
	}
	
	
	
	}

}
