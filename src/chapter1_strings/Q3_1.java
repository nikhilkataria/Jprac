package chapter1_strings;
// Given two strings, write a method to decide if one is a permutation of the other.
public class Q3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="myname";
		String S2="namemt";
		
		checkIfPerm(S1,S2);

	}
	private static void checkIfPerm(String S1,String S2){
		boolean char_set[] = new boolean[256];
		for (char S: S1.toCharArray()){
			char_set[S]=true;
		}
		for (char Chk: S2.toCharArray()){
			if(char_set[Chk]!=true){
				System.out.println("this is wrong");
			}
		}
		System.out.println("Finished");
	}

}
