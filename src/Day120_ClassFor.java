class Score {

	public void show(int[][] grade) {
		
		int hap = 0;
		
		for(int i = 0; i < grade.length; i++) {
			for( int j = 0; j < grade[i].length; j++) {
				hap += grade[i][j];
			}
		}
		System.out.println(hap/12.0);
	}
}
public class Day120_ClassFor {  // 출력작업
	
	public static void main(String[] args) {
		
		int [][] grade= {{90,100,80},
	            		{70,95,87},
	            		{80,90,70},
	            		{90,100,100}};
		
		Score s = new Score();
		s.show(grade);
	}
}