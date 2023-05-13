package DemoClass;

import java.util.Random;
import java.util.Scanner;

public class accessModifierPracticeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //0 for rock
		 // 1 for paper
		// 2 for scissor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for Paper , 2 for scissor");
		int userInput = sc.nextInt();
		System.out.println("user Input"+userInput);
		
		Random random = new Random();
		int bound = 3;
		int computerInput = random.nextInt(bound);
		System.out.println("computer Input"+computerInput);
		
		if(userInput == computerInput) {
			System.out.println("Draw");
		}else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
				||userInput == 2 && computerInput == 1) {
			System.out.println(" you win");
		}else {
			System.out.println("computer win");
		}
	}
	}
