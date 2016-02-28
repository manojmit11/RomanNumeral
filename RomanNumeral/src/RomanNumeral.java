
public class RomanNumeral {

	

	public String arabicToRoman(Integer arabic) {
		
		StringBuilder result= new StringBuilder();
		
		if(arabic==4)
		{
			result.append("IV");
			arabic-=4;
			
		}
		
		else for(;arabic>0;){
		result.append("I");
		arabic--;
		}
		return result.toString();
		
		
		
	}
	

}
