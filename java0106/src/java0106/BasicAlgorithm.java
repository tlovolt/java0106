package java0106;

import java.util.Scanner;

public class BasicAlgorithm {

	public static void main(String[] args) {
		//합계를 구할 때 합을 저장할 변수를 규칙이 성립되기 전 또는 합을 구하기 전까지의 값으로 초기화
		
		int [] ar = {30, 47, 51, 27, 38};
		int sum = 0;
		for(int data : ar) {
			sum = sum + data;
		}
		System.out.print("합계:" + sum);
		
		//피보나치 수열
		//1,1,2,3,5,8,13,21,34,55,89,....
		//피보나치 수열은 첫번째 와 두번째는 무조건 1 세번째 부터는 이전 2개 항의 합
		//입력받은 정수의 항 까지 피보나치 수열의 합을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합을 구할 항의 번호:");
		int su = sc.nextInt();
		if(su == 1) {
			System.out.print("합은 1\n");
		}else if(su == 2) {
			System.out.print("합은 2\n");
		}else {
			//두번째 항 까지는 규칙이 적용되지 않기 때문에 미리 합계를 구해놓아야 합니다.
			sum = 2;
			//현재 항의 두번째 이전 데이터를 저장할 변수
			int f2 = 1;
			//현재 항의 첫번째 이전 데이터를 저장할 변수
			int f1 = 1;
			//현재 계산될 항
			int f = 2;
			for(int i=3; i<=su; i=i+1) {
				sum = sum + f;
				
				//현재 피보나치 수열의 값을 계산하는 방법
				f2 = f1;
				f1 = f;
				f = f1 + f2;
			}
			System.out.print("합은 " + sum);
		}
		
		
		sc.close();

	}
}








