package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice2() {
/*

 * ATM에서 사용자가 원하는 금액을 입력하면, 
 * 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라 
 * ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 
 * 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
 * 
 */
		Scanner sc = new Scanner(System.in);
 
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyThousand = amount / 50000;
		amount %= 50000;
		
		int tenThousand = amount / 10000;
		amount %= 10000;
		
		int fiveThousand = amount / 5000;
		amount %= 5000;
		
		int oneThousand = amount / 1000;
		
		System.out.println("50000원 : " + fiftyThousand);
		System.out.println("10000원 : " + tenThousand);
		System.out.println("5000원 : " + fiveThousand);
		System.out.println("1000원 : " + oneThousand);
		
		
		
		
		
		
		
		
		
		
	}
}
