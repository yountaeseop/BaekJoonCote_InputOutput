package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기
		StringTokenizer st;
		String input;
		
		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a + b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		// bw.write(); 처럼 이것을 사용한다고해서 바로 출력이 되는것이 아니다.
		// Scanner처럼 바로 적용되는것이 아니라 버퍼에 데이터를 저장했다가
		// 버퍼가 flush나 close가 될때 한번에 Stream쪽으로 전달이 되기 때문이다.
		// 따라서 해당값을 출력하기 위해선 bw.flush();와 bw.close();를 꼭 사용해줘야한다.
		// 만약 계속 사용하고 싶다면? bw.close();는 완전 기능을 닫아버리기 때문에 계속하기 위해선
		// bw.flush();를 이용해줘야한다. 줄바꿈이 필요하다면 newLine()을 이용해준다.
	}
}
