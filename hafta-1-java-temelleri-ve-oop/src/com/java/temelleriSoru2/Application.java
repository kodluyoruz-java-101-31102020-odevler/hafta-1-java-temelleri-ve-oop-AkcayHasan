package com.java.temelleriSoru2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secim;
		
		System.out.println("Seçim Yapınız (1- Toplama, 2- Çıkarma, 3- Çarpma, 4- Bölme)");
		
		secim = scan.nextInt();
		
		switch (secim) {
		
		case 1 : 
			System.out.println("Toplama işlemini seçtiniz iki değer giriniz..");
			int sayi1 = scan.nextInt();
			int sayi2 = scan.nextInt();
			int toplam = topla(sayi1,sayi2);
			System.out.println("Değerlerin Toplamı: " + toplam);
			break;
		
		case 2 : 
			System.out.println("Çıkarma işlemini seçtiniz iki değer giriniz..");
			int sayi3 = scan.nextInt();
			int sayi4 = scan.nextInt();
			int cikarma = cikar(sayi3,sayi4);
			System.out.println("Değerlerin Toplamı: " + cikarma);
			break;
			
		case 3 : 
			System.out.println("Çarpma işlemini seçtiniz iki değer giriniz..");
			int sayi5 = scan.nextInt();
			int sayi6 = scan.nextInt();
			int carpma = carp(sayi5,sayi6);
			System.out.println("Değerlerin Toplamı: " + carpma);
			break;
			
		case 4:
			System.out.println("Bölme işlemini seçtiniz iki değer giriniz..");
			int sayi7 = scan.nextInt();
			int sayi8 = scan.nextInt();
			int bolme = bol(sayi7,sayi8);
			System.out.println("Değerlerin Toplamı: " + bolme);
			break;
			
		default :
			System.out.println("Hatalı Seçim!");
			break;
		}
		
		scan.close();
		
		

	}
	
	public static int topla(int a,int b) {
		return a+b;
	}
	
	public static int cikar(int a,int b) {
		return a-b;
	}
	
	public static int carp(int a,int b) {
		return a*b;
	}
	
	public static int bol(int a,int b) {
		return a/b;
	}
	

}
