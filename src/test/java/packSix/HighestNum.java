package packSix;

public class HighestNum {

	public static void main(String[] args) {
		int scoreBoard[]= {1,4,7,3,6};
		HighestNum.getHighScore(scoreBoard);

	}
	
	public static int getHighScore(int[] ScoreBoard) {
		int High=0;
		for(int i=0; i<ScoreBoard.length; i++) {
			
			if(High<ScoreBoard[i]) {
				High=ScoreBoard[i];
			}
			else {
				High=High;
			}
		}
		System.out.println("The Hightest Number is "+High);
		return High;
	}

}
