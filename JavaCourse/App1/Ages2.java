package App1;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Doğum tarihi giriniz (DD/MM/YYY");
	
	String dogumTarihiString = scanner.next();
	
	DateTimeFormatter dt = DateTimeFormatter.ofPattern(dogumTarihiString, dt);
	LocalDate

	}

}
