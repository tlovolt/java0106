package java0106;

public class BreakAndContinue {

	public static void main(String[] args) {
		// 1부터 10까지 출력하는 구문
		for (int i = 1; i < 11; i = i + 1) {
			// 4의 배수가 되면 반복문 중단 - 1, 2, 3 중단
			if (i % 4 == 0) {
				break;
			}

			System.out.println("i:" + i);
		}

		System.out.println("============================");
		// 1부터 10까지 출력하는 구문
		for (int i = 1; i < 11; i = i + 1) {
			// 4의 배수가 되면 다음 반복으로 이동
			//1,2,3,5,6,7,9,10
			if (i % 4 == 0) {
				continue;
			}
			System.out.println("i:" + i);
		}
	}
}
