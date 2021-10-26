package com.naver.Mon;

public class example {

	public static void main(String[] args) {
		
		int year = 2021;
		//year 가 윤년인지 판별
		//year 가 4의 배수이고 100의 배수가 아니면 윤년
		//또는 400의 배수인 경우
		
		//배수는 그 숫자로 나눈 나머지가 0인 수
		boolean pan = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
			
				if(pan==true) {
					System.out.println("year는 윤년");
				}
				else {
					System.out.println("year는 윤년이 아님");
				}
		
	}

}
