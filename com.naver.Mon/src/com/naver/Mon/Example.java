package com.naver.Mon;

public class Example {

	public static void main(String[] args) {
		double d1 = 20.7;
		double d2 = 19.3;
	
		double max = d1 > d2 ? d1 : d2;
		System.out.println("큰수 :" + max);
		

		//113507 초가 몇 시간 몇분 몇초인지 계산
		int time = 113507;
		int hour = time / 3600;
		int min = (time -(hour * 3600))/ 60;
		int sec = time - (hour * 3600) - (min * 60);
		
		System.out.println(hour +"시간 "+min + "분 " + sec + "초");
		
		//다른 방법
		/*
		 * int min = time % 3600 / 60;
		 * int sec = time % 60;
		 * 
		 */
		
		//출력
		
		int x = 30;
		int y = 70;
		int temp;
		//x와 y의 데이터를 교환하기 - swap
		//콜라가 가득 든 컵과 사이다가 가득 든 컵이 있을 때 
		//2개의 컵의 내용물을 어떻게 바꿀 수 있는지가 힌트
		temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
