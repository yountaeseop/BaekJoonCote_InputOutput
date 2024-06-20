package java11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		
		int num = 0;
		
		for(int i = 0; i < str.length(); i++) {
			// 숫자일때 진법변환
			if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				num = num*N + ((int)str.charAt(i) - (int)'0');
			}
			else { // 영문일때 진법변환
				num = num*N + ((int)str.charAt(i) - (int)'A' + 10); 
			}
		}
		
		System.out.println(num);
	}
}
