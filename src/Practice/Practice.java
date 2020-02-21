/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author inspiron
 */

import java.util.Random;
import java.util.Scanner;

public class Practice {
	int[][] board = new int[3][3];
	boolean gameOver = false;
	int turnCounter = 0;

	public void start() {
    	
    	System.out.println("Welcome to the game!!");
    	initializeBoard();
    	
    	while (!gameOver) {
    		
    		makeTurn();
    		displayBoard();
   	
        	// Display the board before
        	//displayBoard();   
    	
    		checkRowForWinner(0);
    		checkRowForWinner(1);
    		checkRowForWinner(2);
    		
    		checkColumnForWinner(0);
    		checkColumnForWinner(1);
    		checkColumnForWinner(2);
    		
    		checkDiagonal1ForWinner();
    		checkDiagonal2ForWinner();
    	}
    	// Display the board before

	}

	public void makeTurn() {
		Scanner input = new Scanner(System.in);
		// if counter is even, it is players turn
		if (turnCounter % 2 == 0) {
			System.out.println("This is Players'S turn");
			System.out.println("Please enter row and column:");
			int row = input.nextInt();
			int column = input.nextInt();
			board[row][column] = 1;
		} else {
			Random random = new Random();
			int row = random.nextInt(3);
			int column = random.nextInt(3);
			System.out.println("Now, Computer'S turn");
			
			while (board[row][column] != 0) {
				row = random.nextInt(3);
				column = random.nextInt(3);
			}
			board[row][column] = -1;
		}
		turnCounter++;
	}
	
	public void displayBoard() {
		
		System.out.println("The board is:");
    	
		for(int i=0; i<board.length; i++) {
    		for(int j=0; j<board.length; j++) {
    			System.out.print("\t |" + board[i][j] + "|" );
    			}
    		System.out.println();
    		}
		}
	
	public void initializeBoard() {
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("Please enter 9 numbers (-1, 0, 1): ");
		
    	for(int i=0; i<board.length; i++) {
    		
    		for(int j=0; j<board.length; j++) {
    			
    			//System.out.print(board[i][j]);
    			board[i][j] = 0;//input.nextInt();
    		}
    	}
	}
	
	public int checkRowForWinner(int rowNumber) {
		int sum = board[rowNumber][0]
				+ board[rowNumber][1]
				+ board[rowNumber][2];
		
		if (sum == 3) {
			// x won
			System.out.println("X (PLAYER) is a winner.");
			gameOver = true;
			return 1;
		}
		
		else if(sum== -3) {
			// 0 won
			System.out.println("O (COMPUTER) is a winner.");
			gameOver = true;
			return -1;
		}
		 
		return 0;	 // No winner for this row
	}
	
	public int checkColumnForWinner(int columnNumber ) {
		int sum = board[0][columnNumber] 
				+ board[1][columnNumber] 
				+ board[2][columnNumber];
		
			 if (sum == 3){
				 // X won
				 System.out.println("X is a winner.");
				 gameOver = true;
				 return 1;
			 }
			 
			 else if (sum == -3) {
				 // O won
				 System.out.println("O is a winner.");
				 gameOver = true;
				 return -1;
			}
			
			 return 0;	 // No winner for this column
		}
	
	public void checkDiagonal1ForWinner() {
		int sum = board[0][2] 
				+ board[1][1] 
				+ board[2][0];
		
		
			 if (sum == 3){
				 // X won
				 System.out.println("X is a winner.");
				// return 1;
				 gameOver = true;
			 }
			 
			 else if (sum == -3) {
				 // O won
				 System.out.println("O is a winner.");
				//return -1;
				 gameOver = true;
			}
			
			// return 0;	 // No winner for this column
		}
	public void checkDiagonal2ForWinner() {
		int sum = board[0][0] 
				+ board[1][1] 
				+ board[2][2];
		
		
			 if (sum == 3){
				 // X won
				 System.out.println("X is a winner.");
				// return 1;
				 gameOver = true;
			 }
			 
			 else if (sum == -3) {
				 // O won
				 System.out.println("O is a winner.");
				//return -1;
				 gameOver = true;
			}
			
			// return 0;	 // No winner for this column
		}
}
