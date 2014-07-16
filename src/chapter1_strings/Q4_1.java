package chapter1_strings;
/*Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing in Java,
please use a character array so that you can perform this operation in place.)
*/
public class Q4_1 {
	public static void main(String args[]){
		String S = "this is a sample string.";
		replaceSpace(S);	
	}
	
	private static void replaceSpace(String S){
		
		char newarr[] = S.toCharArray();
		String S2="";
		for(char n: newarr){
			
			if (n==' '){
				S2+="%20";
				
			}
			else{
				S2+=n;
			}
			
		}
		System.out.println("S2::"+S2);
	}
}
