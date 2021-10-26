package com.naver.Mon;

public class Shift {

	public static void main(String[] args) {
		//and 나 or는 좌우의 식의 순서를 변경해도 결과는 동일
		//1부터 100까지에서 3의 배수이고 4의 배수인 데이터의 개수를 확인
		//&&는 앞의 결과가 false 이면 뒤의 결과를 확인하지 않음
		//||는 앞의 결과가 true 이면 뒤의 결과를 확인하지 않음
		int cnt = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		cnt = 0;
		
		//위의 방법 보다는 아래 방법이 더 좋다고 할 수 있습니다.
		
		for(int i=1; i<=100; i++) {
			if(i%4==0 && i%3==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
