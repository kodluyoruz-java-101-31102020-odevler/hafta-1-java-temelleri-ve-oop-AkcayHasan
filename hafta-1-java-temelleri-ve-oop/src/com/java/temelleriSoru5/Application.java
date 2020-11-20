package com.java.temelleriSoru5;

import java.util.Random;

public class Application {
	
	private static int i = 0;

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrayHoundred = new int[100];
		
		for(i=0; i < arrayHoundred.length; i++) {
			arrayHoundred[i] = random.nextInt();
			System.out.println("Dizi : "+arrayHoundred[i]);
			tekCift(arrayHoundred);
		}
	}
	
	public static void tekCift(int[] arrayHoundred) {
		if(arrayHoundred[i] %2 == 0) {
			System.out.println("Çift Sayılar: "+arrayHoundred[i]);
		}
		if (arrayHoundred[i] %2 == 1 || arrayHoundred[i] %2 == -1){
			System.out.println("Tek Sayılar: "+arrayHoundred[i]);
		}
	}

}
