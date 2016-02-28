
public class RomanNumeral {

	

	public String arabicToRoman(Integer arabic) {
		
		StringBuilder result= new StringBuilder();
		
		if(arabic==5){
			result.append("V");
			arabic=-4;
		}
		
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
