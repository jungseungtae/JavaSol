import java.util.Scanner;

public class Day119_q6 {
	
	public static void main(String[] args) {

		int score[]=new int[5];

		Scanner s=new Scanner(System.in); 
		System.out.print("5�� �л� ���� �Է� :");
		//1 2 3 4 5
		
		int sum=0,max=0,min;  // ��� ���� �ʱ�ȭ��
		double avg;

		for(int i=0; i < score.length; i++) { // ������ �Է¹���
		score[i]=s.nextInt(); // 12345
		}

		for(int i=0; i < score.length; i++) { // ���� ã��
		if(max < score[i]) { // ������ 0���� ũ�� max�� �Է��� ����
		max=score[i]; // �迭�� �Է��Ͽ� ū ���� max�� ����
		}
		}
		min=max;  // 5�� min ���� ���� min = 5
		for(int i=0; i < score.length; i++) {
		if(min > score[i]) {  
			// �Է°��� min �� 5�� 4,3,2,1 ���Ͽ� ���� ���� �̵�
		min=score[i]; // min�� 1���� ����
		}
	}
	for(int i=0;i<score.length;i++) {
		if(max==score[i] || min==score[i]) {
			continue; //�ְ�, ������ ����
		}		
		else {
			sum+=score[i];
		}
		System.out.print("��ȿ����: " + score[i] + " ");
	}
	System.out.println(sum/3.0);	
	}
}