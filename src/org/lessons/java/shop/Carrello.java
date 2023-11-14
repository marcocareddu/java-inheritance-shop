package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Prodotto[] carrello = new Prodotto[50];
		int arrayIndex = 0;
		String input = "";
		String nome = "";
		float prezzo = 0f;
		int iva = 0;
		String imei = "";
		int ram = 0;
		int dimension = 0;
		boolean smart = false;
		String color = "";
		boolean link = false;

		do {
		    System.out.println("Vuoi inserire un nuovo prodotto?");
		    input = in.nextLine();

		    final String SELECTED_PHRASE = "Stai inserendo un prodotto di tipo ";
		    final String NAME_PHRASE = "Nome del prodotto: \n";
		    final String PRICE_PHRASE = "Prezzo del prodotto: \n";
		    final String VAT_PHRASE = "Iva: \n";

		    if (input.equals("si")) {
		        boolean inserireNuovoProdotto = true;

		        while (inserireNuovoProdotto) {
		            System.out.println("Quale prodotto vuoi inserire?\n"
		                    + "Inserisci il numero corrispondente.\n"
		                    + "1. Smartphone\n"
		                    + "2. Televisore\n"
		                    + "3. Cuffia\n");

		            int selectedProduct = in.nextInt();
		            in.nextLine(); // Pulisci il buffer

		            if (selectedProduct == 1) {
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
		                
//		                Print array
		                System.out.println(Arrays.asList(carrello));

//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    inserireNuovoProdotto = false;
		                }
		            } else if (selectedProduct == 2) {
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
						
//		                Print array
		                System.out.println(Arrays.asList(carrello));
		                
//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    inserireNuovoProdotto = false;
		                }
		            } else if (selectedProduct == 3) {
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
		                
//		                Print array
		                System.out.println(Arrays.asList(carrello));

//		                Cicle question
		                System.out.println("Vuoi inserire un altro prodotto? (si/no)");
		                String risposta = in.nextLine();
		                if (!risposta.equals("si")) {
		                    inserireNuovoProdotto = false;
		                }
		            } else {
		                inserireNuovoProdotto = false;
		            }
		        }
		    }
		} while (input.equals("no"));

//		Close
		in.close();
	}
}
