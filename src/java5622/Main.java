package java5622;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String[] alphabet = "ABC DEF GHI JKL MNO PQRS TUV WXYZ 0".split(" ");
		
		String word = sc.nextLine();
		int time = 2;
		
		for(int a = 0; a < alphabet.length; a++) {
			for(int i = 0; i < alphabet[a].length(); i++) {
				
				for(int n = 0; n < word.length(); n++) {
					if(word.charAt(n) == alphabet[a].charAt(i)) {
						
					}
				}
			}
		}
	}

}
