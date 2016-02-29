
public class RomanNumeral {

	private static final int[]    values  = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
	private static final String[] symbols = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
 

	public String arabicToRoman(Integer arabic) {
		
		StringBuilder result= new StringBuilder();
		
		int remaining= arabic;
		
		while(remaining>0){
		for (int i=0;i<values.length;i++)
		{
		remaining= appendRomanLiterals(remaining,values[i],symbols[i],result);
		}
		}
	/*	
		while (remaining >= 1) {
		    result.append("I");
		    remaining -= 1;
		}
	*/	
		return result.toString();
		
	}

	private int appendRomanLiterals(int remaining, int value, String symbol,
			StringBuilder builder) {
		int result= remaining;
		
		if (result>=value)
		{
		  builder.append(symbol);
		  result-=value;
		}
		return result;
	}
	

}
