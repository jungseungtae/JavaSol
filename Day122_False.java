import java.util.Scanner;

public class Day122_False {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int temp;
		
		int ary[] = new int[10];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = s.nextInt();
		}
			for(int i1 = 0; i1 < ary.length-1; i1++) { // 입력 값의 배열
				for(int j = i1+1; j < ary.length; j++) { // 입력 값과 비교할 값
					if(ary[i1] > ary[j]) { // 비교 입력 값과 대입 값을 비교해서 입력 값이 크면
						temp = ary[i1]; //  입력 값을 빈공간에 저장
						ary[i1] = ary[j]; // 비교 값을 i1에 저장
						ary[j] = temp; // temp를 ary[j]에 저장
					}
				}				
			}
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}
