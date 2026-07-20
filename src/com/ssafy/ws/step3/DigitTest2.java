package com.ssafy.ws.step3;

/**
 * 모래시계 모양의 숫자 출력하는 클래스
 */
public class DigitTest2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int n = 17;
		int line = 5;
		int i = 1;
		int space = 0;
		boolean branch = false;
		while(true) {
			for(int s=0;s<space;s++) {
				sb.append("\t");
			}
			for(int k=0;k<line-space*2;k++) {
				sb.append(i).append("\t");
				if(i==n)
					break;
				i++;
			}
			if(i==n)
				break;
			for(int s=0;s<space;s++) {
				sb.append("\t");
			}
			sb.append("\n");
			if(branch==false) {
				space++;
			}else {
				space--;
			}
			if(space*2>line) {
				branch = true;
				space-=2;
			}
				
		}
		System.out.println(sb);
	}
}
