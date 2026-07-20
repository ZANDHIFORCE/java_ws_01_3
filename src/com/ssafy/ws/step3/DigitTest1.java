package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {
		int n=15;
		int count = 0;
		int max = 5;
		int minus = 0;
		for(int i=1;i<=n;i++){
			System.out.print(i);
			System.out.print("\t");

			count++;
			if(count==max-minus){
				System.out.println();
				minus++;
				for(int k=0;k<minus;k++){
					System.out.print("\t");
				}
				count = 0;
			}

		}	
	}
}
