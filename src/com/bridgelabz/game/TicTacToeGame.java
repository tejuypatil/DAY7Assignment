package com.bridgelabz.game;

public class TicTacToeGame {
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
            char[][] board={{' ','|',' ','|',' '},
                    {'-','+','-','+','-'},
                    {' ','|',' ','|',' '},
                    {'-','+','-','+','-'},
                    {' ','|',' ','|',' '}};
            printBoard(board);
        }
}
