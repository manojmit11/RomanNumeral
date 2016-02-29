import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RomanNumeralTests {

	RomanNumeral romanNumeral;
	
	@Before
	public void setUp(){
		
	romanNumeral= new RomanNumeral();
	}
	
	@Test
	public void oneReturnsI() {
		
		assertEquals("I", romanNumeral.arabicToRoman(1));
	}
	
	@Test
	public void tworeturnsII() {
		
		assertEquals("I", romanNumeral.arabicToRoman(1));
		assertEquals("II", romanNumeral.arabicToRoman(2));
	}
	
	@Test
	public void fourreturnsIV() {
		
		assertEquals("IV", romanNumeral.arabicToRoman(4));
		
	}
	
	@Test
	public void fivereturnsV() {
		
		assertEquals("V", romanNumeral.arabicToRoman(5));
		
	}
	
	@Test
	public void NinereturnsIX(){
		
		assertEquals("IX", romanNumeral.arabicToRoman(9));

	}
	
	@Test
	public void TenreturnsX(){
		
		assertEquals("X", romanNumeral.arabicToRoman(10));

	}
	
	
	
	
	
	

}
