package packSix;

import java.util.ArrayList;

public class ArrayExercise {
	public static void main(String[] args) {
		int Scoreboard[]= {1,4,7,3,6};
		ArrayExercise.sumScores(Scoreboard);
	}
	
	public static int sumScores(int[] scoreboard) {
		//int sum = scoreboard[0]+scoreboard[1]+scoreboard[2]+scoreboard[3]+scoreboard[4];
		int sum=0;
		int average;
		for(int i=0;i<=scoreboard.length-1;i++)
		{
			sum=sum+scoreboard[i];
		}
		System.out.println("Sum of the items is "+sum);
		return sum;
	}
	
}
