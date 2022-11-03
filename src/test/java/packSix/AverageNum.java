package packSix;

public class AverageNum {

	public static void main(String[] args) {
		int Scoreboard[]= {1,4,7,3,6};
		AverageNum.average(Scoreboard);
	}
	
	public static float average(int[] scoreboard) {
		int sum=0;
		float average;
		for(int i=0;i<=scoreboard.length-1;i++)
		{
			sum=sum+scoreboard[i];
		}
		average=sum/scoreboard.length;
		System.out.println("Average of the items is "+average);
		return average;
	}


	}

