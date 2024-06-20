package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int countTestCase = sc.nextInt();
		String testCases[][] = new String[countTestCase][2];

		for (int a = 0; a < countTestCase; a++) {
			testCases[a][0] = sc.next();
			testCases[a][1] = sc.next();
		}

		StringBuilder answer = new StringBuilder();	
		
		for (int a = 0; a < countTestCase; a++) { // 2번 
			for (int i = 0; i < testCases[a][1].length(); i++) {
				for (int n = 0; n < Integer.parseInt(testCases[a][0]); n++) {
					answer.append(testCases[a][1].charAt(i));
				}
			}
			answer.append("\n");
		}
		
		System.out.println(answer);

	}
}
