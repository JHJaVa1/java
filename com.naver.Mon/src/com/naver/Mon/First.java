package com.naver.Mon;

public class First {
	public static void main(String[] args) {
		
		int n = -10;
		//~은 1의 보수 : 부호는 반대가 되고 절대값은 1이 증가하거나 감소한다.
		//그래픽 프로그램에서 색상 반전에 이용
		System.out.println("~n :" + ~n);
		
		//!(not) : boolean 데이터 반전
		boolean b = true;
		System.out.println(!b);
		
		n = 10;
		//n의 값을 1 증가 시킨다.
		n++;
		System.out.println("n :" + n);
		
		n = 10;
		//++ 나 -- 가 뒤에 붙으면 ++나 --를 하지 않고 먼저 사용하고
		//나중에 증감을 한다.
		System.out.println("n++:" + n++);
		System.out.println("n:" + n);
		
		n = 10;
		System.out.println("++n:" + ++n);

		//++와 -- 는 C계열의 언어에만 존재
		//C 언어와 Java는 다르게 동작한다.
		//C는 2+2로 4가 나온다. = 한 문장을 모두 번역하고 계산을 한다.
		n = 0;
		int result = ++n + ++n;
		System.out.println("result :" + result);
		
		
		
	}

}