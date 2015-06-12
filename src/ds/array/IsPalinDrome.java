package ds.array;

import java.util.Scanner;

/**
 * find whether the string has a palindrome or not.
 * e.g. abc123a321fgh will return true;
 * 
 * @author prashant dathwal
 */
public class IsPalinDrome {

	public static void main(String[] args) {
        System.out.println("Enter a strng");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("Is String entered Palin == " + hasPalin(str));
	}

	public static boolean hasPalin(String verifyPalin) {
		boolean isPalin = false;
		char[] str = verifyPalin.toCharArray();
		
		for (int i=0;i<verifyPalin.length();i++) {
			for (int j=i+1; j < verifyPalin.length(); j++ ) {
				if (str[i]==str[j] && j-i >1) {
					if (isPalin(verifyPalin, i, j))
						return true;
					break;
				}
			}
		}
		return isPalin;
	}

	private static boolean isPalin(String str, int i, int j) {
		StringBuilder st = new StringBuilder(str);
		st = new StringBuilder(str.substring(i, j+1)).reverse();
		if (str.substring(i,j+1).equals(st.toString()))
		{
			System.out.println(str + " has a palindrome");
			System.out.println("palindrom is :" + st.toString());
			return true;
		}
		return false;
	}
}
