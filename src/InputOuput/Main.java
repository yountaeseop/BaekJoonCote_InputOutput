package InputOuput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if((0 > H || H > 24) || (0 > M || 59 < M)) {
			return;
		}
		
		int earlyTime = 45;
		
		if(M < earlyTime) {
			M += 60;
			M -= earlyTime;
			H -= 1;
			if(H < 0) {
				H = 23;
			}
		} else {
			M -= earlyTime;
			if(H < 0) {
				H = 23;
			}
		}
		
		System.out.printf("%d %d", H, M);
	}
	//자바 특수문자 입출력표 보기
}

// 제출할때, 패키지는 빼고 제출해야한다.
// 클래스이름을 반드시 Main, main으로 해야한다.
