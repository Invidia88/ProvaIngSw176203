package it.unical.ProvaIntermedia;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	public List<Integer> ordineLista(List<Integer> l, String ordine){
		if(ordine.contains("Crescente")) {
			Collections.sort(l);
		}
		else if(ordine.contains("Decrescente")){
			Collections.sort(l, new Comparator<Integer>()  {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
		}
		else 
			System.out.println("Scegliere l'ordine corretto tra Crescente o Decrescente");
		return l;
	}
}
