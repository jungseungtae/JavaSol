import java.util.Scanner;

public class Day122_False {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int temp;
		
		int ary[] = new int[10];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = s.nextInt();
		}
			for(int i1 = 0; i1 < ary.length-1; i1++) { // �Է� ���� �迭
				for(int j = i1+1; j < ary.length; j++) { // �Է� ���� ���� ��
					if(ary[i1] > ary[j]) { // �� �Է� ���� ���� ���� ���ؼ� �Է� ���� ũ��
						temp = ary[i1]; //  �Է� ���� ������� ����
						ary[i1] = ary[j]; // �� ���� i1�� ����
						ary[j] = temp; // temp�� ary[j]�� ����
					}
				}				
			}
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}
