package com.naver.Mon;

public class If_1 {

	public static void main(String[] args) {
		int score = 59;
		
		//score 가 60 이상이면 합격이라고 출력
		if(score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		int su = 76;
		//su가 짝수라면 짝수 라고 출력하기
		//짝수는 2로 나눈 나머지가 0인 숫자
		if(su % 2 == 0) {
			System.out.println("짝수");
		}
		
		int year = 2021;
		//year가 윤년이라면 윤년이라고 출력하고 그렇지 않으면 윤년이 아니라고 출력
		//윤년은 2가지 조건중 하나만 만족하면 됩니다.
		//4의 배수이고 100의 배수는 아닌경우
		//400의 배수인 경우
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
		
		if(score >= 80) {
			System.out.println("장학금");
		}else if (score >=60 && score < 80) {
			System.out.println("보통");
		}else if (score < 60) {
			System.out.println("경고");
		}
		
		
	}

}
