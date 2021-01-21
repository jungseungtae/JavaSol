
public class Day120 {
	
	static int get(int grade[][]) { // 배열함수 정의
		
		int max = 0; // 초기 값 설정
		
		for(int i = 0; i < grade.length; i++) {
			for(int j = 0; j < grade[i].length; j++) {
				 if(max < grade[i][j]) {
					 max = grade[i][j];
			 }
		}	
	}
	return max;
}

	public static void main(String[] args) {
		
		int grade [][] = {{55,60,65}, // 012
						{85,90,95}}; // 123
		
		int high; // 높은 값을 받을 변수 설정
		high = get(grade); // 높은 값은 get 함수에 따라 결정한다.
		
		System.out.println("가장 높은 점수는 " + high + "입니다"); // 출력하기			
	}
}