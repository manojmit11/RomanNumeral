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
	public void test() {
		
		assertEquals("I", romanNumeral.arabicToRoman(1));
	}
	
	

}
