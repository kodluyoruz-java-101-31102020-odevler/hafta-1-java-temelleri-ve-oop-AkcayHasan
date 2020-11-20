package com.java.temelleriSoru3;

import java.util.Random;

public class Application {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrayTen = new int[10];
		
		for(int i=0; i < arrayTen.length; i++) {
			arrayTen[i] = random.nextInt();
			System.out.println(arrayTen[i]);
			ortalamaAl(arrayTen);
		}
		System.out.println("Dizinin Ortalaması: "+ ortalamaAl(arrayTen));

	}
	
	
	public static double ortalamaAl(int[] arrayTen) {
		double toplam = 0.0;
		for(double sayi : arrayTen) {
			toplam += sayi;
		}
		double ortalama = toplam / arrayTen.length;
		return ortalama;
		
	}

}
