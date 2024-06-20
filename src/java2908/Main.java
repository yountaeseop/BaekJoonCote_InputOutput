package java2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String newA = "";
		String newB = "";
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = a.length()-1; i >= 0; i--) {
			sb.append(a.charAt(i));
			sb2.append(b.charAt(i));
		}
		
		if(Integer.parseInt(sb.toString()) > Integer.parseInt(sb2.toString())) {
			System.out.println(sb);
		} else {
			System.out.println(sb2);
		}

	}

}
