package com.naver.Mon;

public class Switch_1 {

	public static void main(String[] args) {
		int menu = 3;
		
		//menu 가 0 이면 한식
		//1이면 붕식
		//2이면 분식
		//3이면 양식
		//나머지는 아무거나
		
		switch(menu) {
			case 0:
				System.out.println("한식");
				break;
			case 1:
				System.out.println("중식");
				break;
			case 2:
				System.out.println("븐식");
				break;
			case 3:
				System.out.println("양식");
				break;
			default:
				System.out.println("아무거나");
				break;
			
		}
	}

}
