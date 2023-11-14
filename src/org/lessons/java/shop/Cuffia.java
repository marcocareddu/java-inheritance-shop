package org.lessons.java.shop;

public class Cuffia extends Prodotto {

	private String color;
	private boolean link;
	
	public Cuffia(String nome, float prezzo, int iva, String color, boolean link) {
		super(nome, prezzo, iva);
		setColor(color);
		setLink(link);
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean getLink() {
		return this.link;
	}
	
	public void setLink(boolean link) {
		this.link = link;
	}
	
//	Full Print
	@Override
	public String toString() {
		return "-----------------------------------------\n"
				+ "Prdotto: " + getName() + "\n"
				+ "Codice Prdotto: " + getId() + "\n"
				+ "Nome composto: " + getExtendedName() + "\n"
				+ "Descrizione: " + getDescription() + "\n"
				+ "Prezzo Lordo: " + "€" + String.format("%.2f", getGrossPrice()) + " di cui iva " + "€" + String.format("%.2f", getIvaAmount()) + "\n"
				+ "Prezzo Netto: " + "€" + String.format("%.2f", getNetPrice()) + "\n"
				+ "Iva: " + getIva() + "%"+ "\n"
				+ "Colore: " + getColor() + "\n"
				+ "È Wireless? : " + getLink()+ "\n"
				+ "-----------------------------------------\n";
	}
}
