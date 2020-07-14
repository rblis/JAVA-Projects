
public class PigLatin {
	private String pig;
	public PigLatin(String pig){
	this.pig = pig;
	}
	public String translate(){
		int space = 0;
		int k =0, conVow = 0;
		String word = "" ;
		
		while (k < pig.length()){
			space = pig.indexOf(' ', k);
			
			if (pigVowel(pig) == true){
				word += pig.substring(k,space) + "way ";
				k += pig.substring(k,space).length()+1;
				}
			else {
				
				for(int j = 0; j < pig.substring(k,space).length(); j++){
					if (pigVowel(pig.substring(j,j+1)) == true){
						conVow = j;
					}
				word += pig.substring(j,space) + pig.substring(k,j) + "ay ";	
				k += pig.substring(k,space).length()+1;
				}
			}

			
		}
		return word;
	}
	private boolean pigVowel(String word){
		if (word.substring(0,1) == "a" ||word.substring(0,1) == "e" 
			||word.substring(0,1) == "i" || word.substring(0,1) == "o" ||word.substring(0,1) == "u"){
			return true;
		}
		else return false;
	}
}
