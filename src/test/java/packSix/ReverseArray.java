package packSix;

public class ReverseArray {

	public static void main(String[] args) {
		int scoreBoard[]= {1,4,7,3,6};
		ReverseArray.ReverseScore(scoreBoard);
	}
	public static int ReverseScore(int Score[]) {
		//int revScore[] = null;
		//int j=0;
		
		for(int i=Score.length-1;i<Score.length;i--) {
			//revScore[j]=Score[i];
			//System.out.println(revScore[j]);
			//j++;
			System.out.println(Score[i]);
		}
		//}
		
		return 1;
		
	}

}
