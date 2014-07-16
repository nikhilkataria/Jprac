package chapter1_strings;
/*
 * Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.
 * 
 */
public class Q5_1 {
	public static void main(String[] arg){
		String S="aaabbccda";
		compressString(S);
	}

	private static void compressString(String s) {
		char[] abc= s.toCharArray();
		int count=1;
		char lastChar;
		String newString="";
		newString+=abc[0];
		for (int i=1;i< abc.length;i++){
			
			if(abc[i]==abc[i-1]){
				count++;
			}else{
				
				newString+=count;
				newString +=abc[i];
				count=1;
				
			}
		
		}
		System.out.println("newstring::"+newString);
	}
}
