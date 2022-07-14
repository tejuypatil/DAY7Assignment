package com.bridgelabz.game;

import java.util.Scanner;

public class TicTacToeGame {

static char computerLetter = ' ';
static char playerLetter = ' ';

    static void showBoard(){
        char[][] board={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        printBoard(board);
    }
   public static void chooseLetter() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("choose the letter: 'X' or 'O' ");
       char playerLetter =scanner.next().charAt(0);
       if(playerLetter=='X'){
           computerLetter='O';
       } else if (playerLetter == 'O') {
           computerLetter='X';
       }
       else{
           chooseLetter();
       }
   }


    public static void printBoard(char[][]board)
    {
        for(int i = 0; i < 5; i++)
        {
                for (int j = 0; j < 5; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
        }
    }
    public static void main(String[] args)
        {
            System.out.println("Welcome to Tic Tac Toe Game");
            chooseLetter();
            showBoard();
        }
}
