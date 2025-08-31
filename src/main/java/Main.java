import br.com.mariojp.solid.srp.*;
import br.com.mariojp.solid.srp.helpers.TaxCalculator;

public class Main {
	
	public static void main(String[] args) {
		
		Order o = new Order();
		o.add(new Item("Café", 8.0, 2)); // 16
		o.add(new Item("Bolo", 12.5, 1)); // 12.5 -> subtotal 28.5
		TaxCalculator taxCalculator = new TaxCalculator(0.10);
		String receipt = new ReceiptService(taxCalculator).generate(o);
		System.out.println(receipt);
		
	}
}
