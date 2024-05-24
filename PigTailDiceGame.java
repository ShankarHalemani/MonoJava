package com.techlabs.forloop;

import java.util.Random;
import java.util.Scanner;

public class PigTailDiceGame {

	public static void main(String[] args) {

		//initialization
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int sum = 0;
		int totalTurns = 0;

		//loop runs till sum of dice becomes 20 or more than 20
		while (sum < 20) {
			totalTurns++;
			System.out.println("TURN : " + totalTurns);

			System.out.println("Roll or Hold ?");
			String action = scanner.nextLine();

			int scoreForTurn = 0;

			//loop runs till player rolls 1 or wants to hold
			while (action.equalsIgnoreCase("Roll")) {
				int dice = random.nextInt(6) + 1;
				System.out.println("Dice : " + dice);

				if (dice == 1) {
					scoreForTurn = 0;
					System.out.println("Turn over!");
					break;
				} else {
					scoreForTurn += dice;
					System.out.println("Roll or Hold");
					action = scanner.nextLine();
				}
			}

			//score of each turn
			System.out.println("Score for the turn : " + scoreForTurn);
			sum += scoreForTurn;
			System.out.println();
		}

		// Total score of player
		System.out.println("Total score : " + sum);
		System.out.println("You finished in " + totalTurns + " turns!");
		System.out.println("Game over!");

		scanner.close();
	}
}
