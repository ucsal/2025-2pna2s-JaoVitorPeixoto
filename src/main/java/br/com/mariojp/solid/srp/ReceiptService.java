package br.com.mariojp.solid.srp;

import br.com.mariojp.solid.srp.helpers.ReceiptFormatter;
import br.com.mariojp.solid.srp.helpers.TaxCalculator;

public class ReceiptService {

	private final TaxCalculator taxCalculator;

	public ReceiptService(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = taxCalculator.calculateTax(subtotal); // Removido a taxa fixa hardcoded
		double total = subtotal + tax;
		
		return ReceiptFormatter.formatReceipt(order, subtotal, tax, total);
	}
}
