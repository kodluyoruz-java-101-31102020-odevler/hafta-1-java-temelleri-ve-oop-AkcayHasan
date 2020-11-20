package com.java.temelleriSoru1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		String password = "123456";
		
		System.out.println("Şifrenizi Giriniz..");
		Scanner scan = new Scanner(System.in);
		String enteredPassword = scan.nextLine();
		scan.close();
		
		if(password.equalsIgnoreCase(enteredPassword)) {
			System.out.println("Giriş Başarılı!");
		}else {
			System.out.println("Giriş Başarısız.");
		}

	}

}
