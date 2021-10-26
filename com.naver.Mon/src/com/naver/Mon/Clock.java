package com.naver.Mon;

public class Clock {

	public static void main(String[] args) {
		double d = 10.7;
		//d의 값을 소수 첫째 자리에서 반올림해서 저장
		//강제 형 변환과 사칙연산을 적절히 활용하라
		//0.5를 더해서 정수로 형 변환하면 됩니다.
		int result = (int)(d + 0.5);
		System.out.println(result);
		
		d = 10.77;
		//소수 두째 자리 반올림 해서 출력 - 출력값 : 10.8
		System.out.println(((int)(d * 10 + 0.5) / 10.0));
		
		int money = 87650;
		//10의 자리에서 반올림해서 출력하기 - 87700
		int a = ((money + 50) / 100) * 100;
		System.out.println(a);
		
		System.out.println(10>3);
	}
}
