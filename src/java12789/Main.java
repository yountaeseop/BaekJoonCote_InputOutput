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
		String result = "Nice";
		
		// 현재 줄 + 대기 줄 사람 처리
		for(int n = 0; n < a; n++) {
			if(Integer.parseInt(m[n]) != now) {
				if(!dq.isEmpty() && now == dq.getLast()) {
					now += 1;
					dq.removeLast();
					n--;
				} else {
					dq.addLast(Integer.parseInt(m[n]));
				}
			}else {
				now += 1;
			}
		}
		
		// 대기줄에 있는 사람 처
		while(!dq.isEmpty()) {
			// 사이즈로 진행할 경우 덱에서 엘리먼트를 뽑으면
			// 덱의 사이즈가 하나씩 줄어드는 매서드를 사용해야한다. -> getLast()가 아닌 이유
			int val = (int) dq.pollLast();
			
			if(now == val) {
				now+=1;
			}else {
				result = "Sad";
				break;
			}
		}
		
		System.out.println(result);
	}

}
