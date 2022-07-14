package com.bridgelabz.game;

import java.util.Scanner;

public class TicTacToeGame {


    static void putPlayerOnBoard(char[][] board, int position, char symbol){
        switch (position){
            case 1:
                board[0][0]= symbol;
                break;
            case 2:
                board[0][2]= symbol;
                break;
            case 3:
                board[0][4]= symbol;
                break;
            case 4:
                board[2][0]= symbol;
                break;
            case 5:
                board[2][2]= symbol;
                break;
            case 6:
                board[2][4]= symbol;
                break;
            case 7:
                board[4][0]= symbol;
                break;
            case 8:
                board[4][2]= symbol;
                break;
            case 9:
                board[4][4]= symbol;
                break;
        }

    }

    public static char getPlayerLetter()
    {
        Scanner scanner = new Scanner(System.in);

        char letter;
        do
        {
            System.out.println("choose the letter: 'X' or 'O' ");
            letter =scanner.next().charAt(0);

        }while( letter != 'X' && letter != 'O');

        return letter;
    }

    public static char getComputerLetter(char pLetter)
    {
        if(pLetter == 'X')
        {
            return 'O';
        }
        else
        {
            return 'X';
        }
    }

    public static void printBoard(char[][]board)
    {

       // printBoard(board);
        for(int i = 0; i < 5; i++)
        {
                for (int j = 0; j < 5; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
        }
    }
    private static int getPositionFromUser() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Select the position 1 to 9:");
        int position=scan.nextInt();
        return position;
    }



    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic Tac Toe Game");

        char computerLetter = ' ';
        char playerLetter = ' ';
        char [][] board= new char[][]{
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        playerLetter = getPlayerLetter();
        computerLetter = getComputerLetter(playerLetter);

        printBoard(board);

        while (true)
        {
            int position=getPositionFromUser();

            putPlayerOnBoard(board,position,playerLetter);
            printBoard(board);
        }

    }


}

