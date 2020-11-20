package com.java.temelleriSoru6;

public class Printer {
	
	// Aşağıdaki fonksiyonları Application sınıfında nesne oluşturmadan çağırabilmek için static metot kullandık.

	public static void printPDFDocument() {
		PDFDocument pdf = new PDFDocument("PDF Document");
		System.out.println(pdf.getBody());
		
	}
	
	public static void printWordDocument() {
		WordDocument word = new WordDocument("Word Document");
		System.out.println(word.getBody());
	}

}
