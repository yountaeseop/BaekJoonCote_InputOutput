package java12789;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.nextLine();
		
		String[] m = sc.nextLine().split(" ");
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int now = 1;
		
		for(int n = 0; n < m.length; n++) {
			if(Integer.parseInt(m[n]) == now) {
				now += 1;
			}else {
				dq.addLast(Integer.parseInt(m[n]));
			}
		}
		
		while(dq.size() != 0) {
			// 사이즈로 진행할 경우 덱에서 엘리먼트를 뽑으면
			// 덱의 사이즈가 하나씩 줄어드는 매서드를 사용해야한다. -> getLast()가 아닌 이유
			int val = (int) dq.pollLast();
			
			if(now == val) {
				now+=1;
			}else {
				System.out.println("Sad");
				return;
			}
		}
		
		System.out.println("Nice");
	}

}
