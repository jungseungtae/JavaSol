
public class Day120 {
	
	static int get(int grade[][]) { // �迭�Լ� ����
		
		int max = 0; // �ʱ� �� ����
		
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
		
		int high; // ���� ���� ���� ���� ����
		high = get(grade); // ���� ���� get �Լ��� ���� �����Ѵ�.
		
		System.out.println("���� ���� ������ " + high + "�Դϴ�"); // ����ϱ�			
	}
}