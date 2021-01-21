import java.util.Scanner;

public class Day119_q6 {
	
	public static void main(String[] args) {

		int score[]=new int[5];

		Scanner s=new Scanner(System.in); 
		System.out.print("5명 학생 점수 입력 :");
		//1 2 3 4 5
		
		int sum=0,max=0,min;  // 결과 값을 초기화함
		double avg;

		for(int i=0; i < score.length; i++) { // 점수를 입력받음
		score[i]=s.nextInt(); // 12345
		}

		for(int i=0; i < score.length; i++) { // 고점 찾기
		if(max < score[i]) { // 점수가 0보다 크면 max는 입력한 숫자
		max=score[i]; // 배열을 입력하여 큰 값을 max로 설정
		}
		}
		min=max;  // 5를 min 값에 대입 min = 5
		for(int i=0; i < score.length; i++) {
		if(min > score[i]) {  
			// 입력값이 min 값 5와 4,3,2,1 비교하여 작은 수로 이동
		min=score[i]; // min에 1값을 대입
		}
	}
	for(int i=0;i<score.length;i++) {
		if(max==score[i] || min==score[i]) {
			continue; //최고, 최저값 제외
		}		
		else {
			sum+=score[i];
		}
		System.out.print("유효점수: " + score[i] + " ");
	}
	System.out.println(sum/3.0);	
	}
}