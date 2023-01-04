package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		//GIVEN-On haz�rl�klar
		String orjinalMetin ="Uc     tas  hos  ho     saf     ....  .";
		
		//When- Asil Testi gercekle�tir
		String sonuc= MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		//Then- kontroller
		assertEquals("Uctashoshosaf.....", sonuc);
	}



@Test
public void testBosluklariTemizleNull() {
	//GIVEN-On haz�rl�klar
	String orjinalMetin = null;
	
	//When- Asil Testi gercekle�tir
	String sonuc= MetinIslemleri.bosluklariTemizle(orjinalMetin);
	
	//Then- kontroller
	assertEquals("", sonuc);
}

@Test
public void testBosluklariTemizleNew() {
    // GIVEN - On hazirliklar
    MetinIslemleri obje;

    // WHEN - Asil testi gerceklestir
    obje = new MetinIslemleri();

    // THEN - Kontroller
    assertNotNull(obje);
}



}