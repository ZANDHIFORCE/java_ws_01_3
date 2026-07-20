package com.ssafy.ws.step3;

import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class GameTest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택지를 골라주세요\n1. 5판3승\n2. 3판2승\n3. 단판승");
		int select=sc.nextInt();
		int[] score = new int[3];

		switch(select){
			case 1:
				for(int i=0;i<5;i++){
					score[game(sc)]++;
					if(score[1]>=3 || score[2]>=3)
						break;
				}
				break;
			case 2:
				for(int i=0;i<3;i++){
					score[game(sc)]++;
					if(score[1]>=2 || score[2]>=2)
						break;
				}
				break;
			case 3:
				score[game(sc)]++;
				break;

		}

		if(score[1]<score[2]){
			System.out.println("이겼습니다.");
		}
		else if(score[1]>score[2]){
			System.out.println("졌습니다.");
		}
		else{
			System.out.println("비겼습니다.");
		}




		sc.close();
	}
	
	public static int game(Scanner sc){
		int computer = (int)(Math.random()*3)+1;
		System.out.print("가위, 바위, 보 입력: ");
		String p = sc.next();
		int person = convertToInt(p);
		System.out.println(convertToString(computer));

		if(person==computer) {
			return 0;
		}else if((person+1)%3==computer){
			return 1;
		}else {
			return 2;
		}
	}
	
	public static String convertToString(int num){
		switch(num){
			case 1:
				return "가위";
			case 2:
				return "바위";
			case 3:
				return "보";
		}
		return "오류";
	}

	public static int convertToInt(String line){
		switch(line){
			case "가위":
				return 1;
			case "바위":
				return 2;
			case "보":
				return 3;
		}
		return -1;
	}

	public static String printWin(int num){
		switch(num){
			case 0:
				return "비겼습니다.";
			case 1:
				return "졌습니다.";
			case 2:
				return "이겼습니다.";
		}
		return "";
	}
}
