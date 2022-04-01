import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		try (Scanner input = new Scanner(System.in)) {
			
			boolean isWin = false;
			
			int max = 101;
			
			int round = 0;
			
			int answerer;
			
			System.out.print("Input a number from 0 to 100: ");
			int asker = input.nextInt();
			
			while (!isWin) {
				round++;
				
				answerer = rand.nextInt(max);
				
				if (answerer == asker) {
					isWin = true;
					
					System.out.println("Round: " + round + ", Your number: " + asker + ", Cpu\'s answer: " + answerer + ". Is CPU win? " + isWin);
				} else {
					System.out.println("Round: " + round + ", Your number: " + asker + ", Cpu\'s answer: " + answerer + ". Is CPU win? " + isWin);
				}
			}
		}
	}
}
