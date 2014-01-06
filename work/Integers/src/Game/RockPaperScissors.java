package Game;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	private static int playerscore = 0;
	private static int computerscore = 0;
	

	public static void pln (String s){
		System.out.println (s);
	}
	public static void main(String[] args) {
		if (playerscore == 2){
			pln ("You win!");
		}
		if (computerscore == 2){
			pln ("Computer wins!");
		}
		while (true){
		Scanner scan = new Scanner (System.in);
		Random game = new Random();
		int A = game.nextInt(300);
		pln ("Rock paper scissors shoot");
		String B = scan.nextLine();
		if (B.equals("Rock")){//if1			
			if (A <= 100){
				result(1,1);
				playerscore = 1;
				Game2();
				break;
			
			}//end of if2
			else if ((A > 100) && (A < 200)){//else if 1
				result(2,2);
			}//end of else if 1
			else{
				result(3,3);
				computerscore = 1;
				Game3();
				break;
			}
		}//end of if 1
		else if (B.equals("paper")){
			if (A <= 100){
				result(1,3);
				computerscore = 1;
				Game3();
				break;
			}
			else if ((A > 100) && (A < 200)){//else if 1
				result(2,1);
				playerscore = 1;
				Game2();
				break;
			}
			else{
				result(3,2);
		}
		}
		else{
			if (A <= 100){
				result(1,2);
				
			}
			else if ((A > 100) && (A < 200)){//else if 1
				result(2,3);
				computerscore = 1;
				Game3();
				break;
			}
			else{
				result(3,1);
				playerscore = 1;
				Game2();
				break;
			}
		}
		
scan.close();
		}//end while
		
		
	}//end main
	
	public static void result (int choice, int outcome){
		if (choice == 1){
			pln ("Computer does Scissors!");
			
		}
		else if (choice ==  2){
			pln ("Computer does Rock!");
		}
		else{
			pln ("Computer does paper!");
		}
		if (outcome == 1){
			pln ("You win!");
		}
		else if (outcome == 2){
			pln ("Tie!");
		}
		else{
			pln ("Computer wins!");
		}
	}//end of result
	public static void Game2 (){
		if (playerscore == 2){
			pln ("You win!");
			
		}
		if (computerscore == 2){
			pln ("Computer wins!");
		}
		while (true){
			Scanner scan = new Scanner (System.in);
			Random game = new Random();
			int A = game.nextInt(300);
			pln ("Rock paper scissors shoot");
			String B = scan.nextLine();
			if (B.equals("Rock")){//if1			
				if (A <= 100){
					result(1,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				
				}//end of if2
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,2);
				}//end of else if 1
				else{
					result(3,3);
					computerscore = 1;
					Game4();
					break;
				}
					
					
			}//end of if 1
			else if (B.equals("paper")){
				if (A <= 100){
					result(1,3);
					computerscore = 1;
					Game4();
					break;
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				}
				else{
					result(3,2);
			}
			}
			else{
				if (A <= 100){
					result(1,2);
					
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,3);
					computerscore = 1;
					Game4();
					break;
				}
				else{
					result(3,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				}
			}
			
	scan.close();
			}//end while
			
		}//end Game2
	public static void Game3(){
		while (true){
			Scanner scan = new Scanner (System.in);
			Random game = new Random();
			int A = game.nextInt(300);
			pln ("Rock paper scissors shoot");
			String B = scan.nextLine();
			if (B.equals("Rock")){//if1			
				if (A <= 100){
					result(1,1);
					Game4();
					break;
				
				}//end of if2
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,2);
				}//end of else if 1
				else{
					result(3,3);
					pln ("Computer wins the match!");
					break;
				}
			}//end of if 1
			else if (B.equals("paper")){
				if (A <= 100){
					result(1,3);
					pln ("Computer wins the match!");
					break;
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,1);
					Game4();
					break;
				}
				else{
					result(3,2);
			}
			}
			else{
				if (A <= 100){
					result(1,2);
					
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,3);
					pln ("Computer wins the match!");
					break;
				}
				else{
					result(3,1);
					Game4();
					break;
				}
			}
			
	scan.close();
			}//end while
		
			
	}//end Game3

	public static void Game4(){
		while (true){
			Scanner scan = new Scanner (System.in);
			Random game = new Random();
			int A = game.nextInt(300);
			pln ("Rock paper scissors shoot");
			String B = scan.nextLine();
			if (B.equals("Rock")){//if1			
				if (A <= 100){
					result(1,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				
				}//end of if2
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,2);
				}//end of else if 1
				else{
					result(3,3);
					computerscore = 2;
					pln ("Computer whens the match.");
					break;
				}
			}//end of if 1
			else if (B.equals("paper")){
				if (A <= 100){
					result(1,3);
					playerscore = 2;
					pln ("Computer wins the match!");
					break;
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				}
				else{
					result(3,2);
			}
			}
			else{
				if (A <= 100){
					result(1,2);
					
				}
				else if ((A > 100) && (A < 200)){//else if 1
					result(2,3);
					computerscore = 2;
					pln ("Computer wins the match!");
					break;
				}
				else{
					result(3,1);
					playerscore = 2;
					pln ("You win the match!");
					break;
				}
			}
	}//end class
	}
}