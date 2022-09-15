package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money are you starting with: ");
		int startAmount = scan.nextInt();
		System.out.println("What is the win probability? (Enter as a value between 0-1.0): ");
		double winChance = scan.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = scan.nextInt();
		int win = startAmount;
		System.out.println("How many simulations do you want to run?");
		int totalSimulations = scan.nextInt();
		int numRuins = 0;
		for(int day=1; day<=totalSimulations; day++) {
			int plays = 0;
			while(win < winLimit && win > 0) {
				double didYouWin = Math.random();
				if(didYouWin <= winChance) {
					win ++;
					plays ++;
				}
				else {
					win --;
					plays ++;
				}
			}
			System.out.print("Simulation " + day + ":");
			System.out.print(" " + plays + " ");
			
		
				if(win==winLimit) {
					System.out.println("WIN");
				}
				else {
					System.out.println("LOSE");
					numRuins ++;
				}
				win = startAmount;

		}
		double ruinRate = (double)numRuins/totalSimulations;
		double expectedRuins;
		double a = (1-winChance)/(winChance);
		if(winChance == 0.5) {
			expectedRuins = 1- (startAmount/winLimit);
		}
		else {
			expectedRuins = (Math.pow(a, startAmount)-Math.pow(a,winLimit))/(1-(Math.pow(a, winLimit)));
		}
		System.out.print("Ruin rate from simulation: " + ruinRate + " Expected Ruin Rate: " + expectedRuins);

	}

}
