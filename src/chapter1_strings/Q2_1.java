package chapter1_strings;
//reverse a string
import java.util.Scanner;

public class Q2_1 {
	private static Scanner scan1;
	public static void main(String args[]){
		System.out.println("enter the string to reverse");
		scan1= new Scanner(System.in);
		String text1=scan1.nextLine();
		System.out.println("scanned in text::"+text1);
		
		reverse(text1);
	}
	private static String reverse(String text1){
		int len=text1.length();
		int j=len-1;
		char temp;
		char text2[]=text1.toCharArray();
		for (int i =0; i < len/2 ;i++,j--)
		{
			 temp = text2[i];
			text2[i] = text2[j];
			text2[j]= temp;		
		}
		
		System.out.println("==>"+new String(text2));
		
		return (new String (text2));
	}

}
