
public class RomanNumeral {

	

	public String arabicToRoman(Integer arabic) {
		
		StringBuilder result= new StringBuilder();
		
		while(arabic>0){
		result.append("I");
		arabic--;
		}
		return result.toString();
		
		
		
	}
	

}
