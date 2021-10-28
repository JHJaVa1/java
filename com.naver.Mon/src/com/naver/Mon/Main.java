package com.naver.Mon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i;
		int sum1 = 1;
		int sum2 = 1;
		int sum3;
		sc.close();
		
		if(a == 1) {
			System.out.println("1");
		}else if(a == 2) {
			System.out.println("1 1");
		}else {
			System.out.print("1 1 ");
			for(i = 1;i<a-1;i++) {
				sum3 = sum1 + sum2;
				sum1 = sum2;
				sum2 = sum3;
				System.out.print(sum3 + " ");
				
			}
		}







	}

}