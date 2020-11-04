package it.unical.ProvaIntermedia;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App 
{

	public static void main( String[] args )
    {
		List<Integer> listaDaOrdinare = new LinkedList<Integer>();
        MyListUtil list = new MyListUtil();
        listaDaOrdinare=Arrays.asList(1,2,8,9,3,6);
        System.out.println(list.ordineLista(listaDaOrdinare, "Decrescente"));
    
    }
}
