package br.com.mariojp.solid.srp.Interfaces;
import java.util.List;

public interface Orderable {
  
	public void add(Itemable i);

	public List<Itemable> getItems();

}
