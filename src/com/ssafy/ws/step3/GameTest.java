package com.ssafy.ws.step3;

import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class GameTest {

	public static void main(String[] args) {
		//단판!
		int computer = (int)(Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.print("(단판)번호를 입력하세요: ");
		int person = sc.nextInt();
		
		if(person==computer) {
			System.out.println("비겼습니다.");
		}else if((person+1)%3==computer){
			System.out.println("컴퓨터가 이겼습니다.");
		}else {
			System.out.println("사람이 이겼습니다.");
		}
	}
}
