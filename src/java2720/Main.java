package java2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCaseNum = Integer.parseInt(br.readLine());
		int[] testCases = new int[testCaseNum];

		for (int a = 0; a < testCaseNum; a++) {
			testCases[a] = Integer.parseInt(br.readLine());
		}

		for (int a = 0; a < testCases.length; a++) {
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			int answer = 0;
			
			q = testCases[a] / 25;
			answer = testCases[a] % 25;
			d = answer / 10;
			answer = answer % 10;
			n = answer / 5;
			answer = answer % 5;
			p = answer / 1;
			answer = answer % 1;
			
			System.out.printf("%d %d %d %d\n", q, d, n, p);
		}
	}
}
