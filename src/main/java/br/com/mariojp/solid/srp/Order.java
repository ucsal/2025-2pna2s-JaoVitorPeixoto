package br.com.mariojp.solid.srp;
import java.util.ArrayList;
import java.util.List;

import br.com.mariojp.solid.srp.Interfaces.*;

public class Order implements Orderable{
	private final List<Itemable> items = new ArrayList<>();

	public void add(Itemable i) {
		items.add(i);
	}

	public List<Itemable> getItems() {
		return items;
	}
}
