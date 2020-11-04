package it.unical.ProvaIntermedia;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil myList;
	
	@Before
	public static void init() {
		System.out.println("Before");
		myList = new MyListUtil();		
		
	}

	@Test
	public void ordinamentoListaWorks() {
		assertEquals(Arrays.asList(2,4,5,8,9), myList.ordineLista(Arrays.asList(4,5,8,2,9), "Crescente"));
		assertEquals(Arrays.asList(9,8,5,4,2), myList.ordineLista(Arrays.asList(4,6,8,2,9), "Decrescente"));
	}

		
}
