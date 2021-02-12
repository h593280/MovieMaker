package kjedeKoeTest;

import static org.junit.Assert.assertEquals;    
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import øving3.EmptyCollectionException;
import øving3.KoeADT;
 

public abstract class KjedetKoeADT {

	private KoeADT <Integer> test;

	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;

	protected abstract KoeADT<Integer>reset();

	@BeforeEach
	void setup() {
	test = reset();
	}
		    
	@Test
	void ErTom() {
	assertTrue(test.erTom());	
	}
	
	@Test
	 void erIkkeTom() {
		test.innKoe(e0);
		assertFalse(test.erTom());
	}
		

	@Test 
	void innKoeOgUtKoe() {

	try {
		
		//e0 --> e1 --> e2 --> e3
		
		test.innKoe(e0);
		test.innKoe(e1);
		test.innKoe(e2);
		test.innKoe(e3);
		
		System.out.println(test.toString());
		
		assertEquals(e0, test.utKoe());
		assertEquals(e1, test.utKoe());
		System.out.println(test.toString());
		} catch (EmptyCollectionException e) {
			fail("failed unexpectedly " + e.getMessage());
		}
	}
	
	@Test
	public void innOgUtMedDuplikater() {
		
		try {

			
		test.innKoe(e0);
		test.innKoe(e1);
		test.innKoe(e1);
		test.innKoe(e2);

		assertEquals(e0, test.utKoe());
		assertEquals(e1, test.utKoe());
		assertEquals(e1, test.utKoe());
		assertEquals(e2, test.utKoe());
		
		} catch (EmptyCollectionException e) {
			fail("pop failed unexpectedly " + e.getMessage());
		}
	}
	
	
	@Test
	public void innUtInnInnUtInnUt() {
		
		try {
			test.innKoe(e2);
			assertEquals(e2, test.utKoe());
			test.innKoe(e3);
			test.innKoe(e4);
			assertEquals(e3, test.utKoe());
			test.innKoe(e5);
			assertEquals(e4, test.utKoe());

		} catch (EmptyCollectionException e) {
			fail("pop or top failed unexpectedly " + e.getMessage());
		}
	}

	@Test
	public void InnUtTom() {
		try {
			test.innKoe(e0);
			assertEquals(e0, test.utKoe());
			assertTrue(test.erTom());
		} catch (EmptyCollectionException e) {
			fail("pop failed unexpectedly " + e.getMessage());
		}
	}
	
	
}
