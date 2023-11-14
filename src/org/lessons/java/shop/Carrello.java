package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Prodotto[] carrello = new Prodotto[50];
		int arrayIndex = 0;
		double sumCart = 0d;
		String input = "";
		String nome = "";
		float prezzo = 0f;
		int iva = 0;

		do {
//		    Consts
		    final String SELECTED_PHRASE = "Stai inserendo un prodotto di tipo ";
		    final String NAME_PHRASE = "Nome del prodotto: \n";
		    final String PRICE_PHRASE = "Prezzo del prodotto: \n";
		    final String VAT_PHRASE = "Iva: \n";
		    
//		    Vars
			boolean fidelity = false;
			int discount = 0;
			
//			Fidelity Question
		    System.out.println("Hai la tessera fedeltà?");
		    String fidelityInput = in.nextLine();
		    if(fidelityInput.toLowerCase().equals("si")) {
		    	fidelity = true;
		    	discount = 2;
		    }

//			NewProduct Question
		    System.out.println("Vuoi inserire un nuovo prodotto?");
		    input = in.nextLine();

		    if (input.equals("si")) {
		        boolean newProduct = true;

		        while (newProduct) {
		            System.out.println("Quale prodotto vuoi inserire?\n"
		                    + "Inserisci il numero corrispondente.\n"
		                    + "1. Smartphone\n"
		                    + "2. Televisore\n"
		                    + "3. Cuffia\n");

		            int selectedProduct = in.nextInt();
		            in.nextLine(); // Pulisci il buffer

		            if (selectedProduct == 1) {
		            	
//		            	Vars
		        		String imei = "";
		        		int ram = 0;

//		        		User inputs
		                System.out.println(SELECTED_PHRASE + "Smartphone.\n");
		                System.out.println(NAME_PHRASE);
		                nome = in.nextLine();

		                System.out.println(PRICE_PHRASE);
		                prezzo = in.nextFloat();

		                System.out.println(VAT_PHRASE);
		                iva = in.nextInt();
		                in.nextLine();

		                System.out.println("Imei: \n");
		                imei = in.nextLine();

		                System.out.println("Ram: \n");
		                ram = in.nextInt();
		                in.nextLine();

//		                New Instance
		                Smartphone nuovoSmartphone = new Smartphone(nome, prezzo, iva, imei, ram);
		                
//		                Push into array
		                carrello[arrayIndex] = nuovoSmartphone;
		                arrayIndex++;
		                
//		                Cart Update
		                sumCart += nuovoSmartphone.getDiscountedPrice(fidelity, discount);

//		                Print array
		                System.out.println(Arrays.asList(carrello));
		                           
//		                Print Cart
		                System.out.println("Il prezzo totale è: " + sumCart);

//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    newProduct = false;
		                }
		            } else if (selectedProduct == 2) {
		            	
//		            	Vars
		        		int dimension = 0;
		        		boolean smart = false;

//		        		User inputs
		                System.out.println(SELECTED_PHRASE + "Televisore.\n");
		                System.out.println(NAME_PHRASE);
		                nome = in.nextLine();
						
						System.out.println(PRICE_PHRASE);
						prezzo = in.nextFloat();
						
						System.out.println(VAT_PHRASE);
						iva = in.nextInt();
						in.nextLine();
						
						System.out.println("Pollici: \n");
						dimension = in.nextInt();
						
						System.out.println("È smart? \n");
						smart = in.nextBoolean();
						
//		                New Instance
						Televisore nuovoTelevisore = new Televisore(nome, prezzo, iva, dimension, smart);
						
//		                Push into array
		                carrello[arrayIndex] = nuovoTelevisore;
		                arrayIndex++;
		                
//		                Cart Update
		                sumCart += nuovoTelevisore.getDiscountedPrice(fidelity, discount);

//		                Print array
		                System.out.println(Arrays.asList(carrello));
		                
//		                Print Cart
		                System.out.println("Il prezzo totale è: " + sumCart);
		                
//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    newProduct = false;
		                }
		            } else if (selectedProduct == 3) {
		            	
//		            	Vars
		        		String color = "";
		        		boolean link = false;
		        		
//		        		User inputs
		                System.out.println(SELECTED_PHRASE + "Cuffia.\n");
		                System.out.println(NAME_PHRASE);
		                nome = in.nextLine();

		                System.out.println(PRICE_PHRASE);
		                prezzo = in.nextFloat();

		                System.out.println(VAT_PHRASE);
		                iva = in.nextInt();
		                in.nextLine();

		                System.out.println("Colore: \n");
		                color = in.nextLine();

		                System.out.println("È Wifi? \n");
		                link = in.nextBoolean();
		                in.nextLine();

//		                New Instance
		                Cuffia nuovaCuffia = new Cuffia(nome, prezzo, iva, color, link);
		                
//		                Push into array
		                carrello[arrayIndex] = nuovaCuffia;
		                arrayIndex++;
		                
//		                Cart Update
		                sumCart += nuovaCuffia.getDiscountedPrice(fidelity, discount);
		                
//		                Print array
		                System.out.println(Arrays.asList(carrello));

//		                Print Cart
		                System.out.println("Il prezzo totale è: " + sumCart);
		                
//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    newProduct = false;
		                }
		            } else {
		                newProduct = false;
		            }
		        }
		    }
		} while (input.equals("no"));

//		Close Scanner
		in.close();
	}
}