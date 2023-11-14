package org.lessons.java.shop;

public class Televisore extends Prodotto {

	private int dimension;
	private boolean smart;
	
	public Televisore(String nome, float prezzo, int iva, int dimension, boolean smart) {
		super(nome, prezzo, iva);
		setDimension(dimension);
		setSmart(smart);
	}
	
	public int getDimension() {
		return dimension;
	}
	
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public boolean getSmart() {
		return this.smart;
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
				+ "Pollici: " + getDimension()+ "\"" + "\n"
				+ "È smart? : " + getSmart()+ "\n"
				+ "-----------------------------------------\n";
	}
}
