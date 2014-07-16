package practice;

import java.util.Scanner;

public class CopyOfQ2_1 {
	private static Scanner scan1;
	public static void main(String args[]){
		System.out.println("enter the string to reverse");
		scan1= new Scanner(System.in);
		String text1=scan1.nextLine();
		System.out.println("scanned in text::"+text1);
		String arr[]=text1.split(" ");
	  int len = arr.length;
	   String temp;
	  int j=len-1;
	  for (int i =0; i < (len/2 )+1; i++,j--){
		 
		  temp=reverse(arr[i]);
		  arr[i]=reverse(arr[j]);
		  arr[j]=temp;
	  }
	  
	 for (String s : arr){
		 System.out.print(s+" ");
	 }
		
	}
	  static String reverse(String arr){
		  char text2[]=arr.toCharArray();
				  int len = text2.length;
		int j = len -1 ;
		char temp;
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
