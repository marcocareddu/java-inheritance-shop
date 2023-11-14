package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int ram;

	public Smartphone(String nome, float prezzo, int iva, String imei, int ram) {
		super(nome, prezzo, iva);
		setImei(imei);
		setRam(ram);
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public int getRam() {
		return ram;
	}
	
	public String getImei() {
		return imei;
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
				+ "Imei: " + getImei()+ "\n"
				+ "Ram: " + getRam() + "GB"+ "\n"
				+ "-----------------------------------------\n";
	}
}
