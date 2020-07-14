
public class test {

	public static void main(String[] args) {
			
			System.out.println(translate("pig latin translation "));
	}
	public static String translate(String pig){
		int space = 0;
		int k =0, firstVowel = 0;
		String sentence = "", word;
		
		while (k < pig.length()){
			space = pig.indexOf(' ', k);
			word = pig.substring(k,space);
			
			if (pigVowel(pig) == true){
				
				sentence += pig.substring(k,space) + "way ";
				k += word.length()+1;
				
			}
			
			else {
				
				for(int j = 0; j < word.length(); j++){//finds first vowel
					
					if (pigVowel(pig.substring(j,j+1)) == true) {firstVowel = j;}
					
					sentence += pig.substring(firstVowel,space)  + "ay ";	
					
					k += word.length()+1;
				}
			}

			
		}
		return sentence;
	}
	private static boolean pigVowel(String word){
		if (word.substring(0,1).equals("a") || word.substring(0,1).equals("e") 
			||word.substring(0,1).equals("i")|| word.substring(0,1).equals("o") ||word.substring(0,1).equals("u")){
			return true;
		}
		else return false;
	}

}
//translate("abcd ") + pig.substring(k,firstVowel)