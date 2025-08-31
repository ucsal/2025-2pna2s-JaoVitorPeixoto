package br.com.mariojp.solid.srp;

import br.com.mariojp.solid.srp.Interfaces.Itemable;

public class Item implements Itemable{
	
	private String name;
	private double unitPrice; 
	private int quantity;
	
	public Item(String name, double unitPrice, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	
}
