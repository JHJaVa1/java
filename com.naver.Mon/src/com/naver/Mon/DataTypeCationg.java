package com.naver.Mon;

public class DataTypeCationg {

	public static void main(String[] args) {
		//정수 변수에 실수 데이터 삽입 - 에러
		//int age = 51.2;
		
		//실수 변수에 정수 데이터를 대입
		//자동 형 변환이 발생해서 에러가 발생하지 않습니다.
		double height = 200;
		System.out.println("키는 : " + height + "cm");

		//강제 형 변환
		//데이터의 자료형을 변경해서 대입
		//실수를 정수로 변경해서 대입
		//소수는 제거됩니다.
		
		int age = (int)51.7;
		System.out.println("나이는 " + age + "입니다.");
		
		//표현범위 밖의 숫자를 강제로 변환해서 대입하면
		//overflow 나 underflow 발생
		//overflow : 가장 큰 쪽으로 넘어가서 가장 작은 것부터 다시 시작
		//underflow는 반대
		//byte 는 -128 ~ 127까지 표현 가능
		byte b = (byte)128;
		System.out.println(b);
		b = (byte)-130;
		System.out.println(b);
		b = (byte)256;
		System.out.println(b);
		
		//변수를 생성하고 데이터를 저장한 후 출력
		char ch = 'F';
		System.out.println("ch는" + ch + "입니다");
		
		//아래 문장은 에러 - 앞에서 ch라는 변수를 생성했는데 또 생성해서.
		//int ch = 'a';
		
		//위의 문제를 해결하는 방법 - 다른 변수를 생성해서 해결
		char charactor = 'a';
		
		//위의 문제를 해결하는 방법 - 데이터의 종류가 같다면 변수를 재사용
		ch = 'a';
		System.out.println(ch);
		System.out.println(charactor);
		int i = 0;
		//3가지 동작을 1초마다 번갈아 가면서 수행
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			//3으로 나눈 나머지 - 0, 1, 2
			int mod = i % 3;
			if(mod == 0) {System.out.println("빨강");}
			if(mod == 1) {System.out.println("파랑");}
			if(mod == 2) {System.out.println("녹색");}
			i++;
			}
		}
		
		
	}

