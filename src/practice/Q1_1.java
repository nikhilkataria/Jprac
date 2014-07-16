package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//Implement an algorithm to determine if a string has all unique characters. What if
//you cannot use additional data structures?
public class Q1_1 {

	private static Scanner reader1;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string\n");

		reader1 = new Scanner(System.in);
		String text1 = reader1.next();
		System.out.println("ur input was" + text1);

		if (checkIfUnique(text1)) {
			System.out.println("UNIQUE");
		} else {
			System.out.println("NOT UNiQUE");
		}

		if (checkIfUniqueUsingHash(text1)) {
			System.out.println("UNIQ");
		} else {
			System.out.println("NOT UNIQ");
		}
		sortStringAndCheckIfUniq(text1);
	}

	private static void sortStringAndCheckIfUniq(String text1) {
		// TODO Auto-generated method stub
		char text2[]=text1.toCharArray();
		Arrays.sort(text2);
		System.out.println(text2);
		for (int i =0 ;i <text2.length-1;i++){
			System.out.println("len"+i);
			if(text2[i]!=text2[i+1]){
				System.out.println("fine");
			}
			else{
				System.out.println("not fine");
			}
		}
			
	}


	private static boolean checkIfUniqueUsingHash(String text1) {
		// TODO Auto-generated method stub
		HashSet<Character> hash_of_chars = new HashSet<Character>();
		for (char s : text1.toCharArray()) {
			if (!hash_of_chars.contains(s)) {
				hash_of_chars.add(s);
			} else {
				System.out.println("Not unique exiting..");

				return false;
			}
		}
		return true;
	}

	private static boolean checkIfUnique(String text1) {
		for (int i = 0; i < text1.length(); i++) {
			for (int j = i + 1; j < text1.length(); j++) {
				if (text1.charAt(i) == text1.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
