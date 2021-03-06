package com.bridgelabz.game;

import java.util.Scanner;

import static java.lang.Math.round;

public class TicTacToeGame {


    static boolean putPlayerOnBoard(char[][] board, int position, char symbol){
        switch (position){
            case 1:
                if (board[0][0] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[0][0]= symbol;
                break;
            case 2:
                if (board[0][2] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[0][2]= symbol;
                break;
            case 3:
                if (board[0][4] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[0][4]= symbol;
                break;
            case 4:
                if (board[2][0] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[2][0]= symbol;
                break;
            case 5:
                if (board[2][2] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[2][2]= symbol;
                break;
            case 6:
                if (board[2][4] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[2][4]= symbol;
                break;
            case 7:
                if (board[4][0] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[4][0]= symbol;
                break;
            case 8:
                if (board[4][2] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[4][2]= symbol;
                break;
            case 9:
                if (board[4][4] != ' ')
                {
                    System.out.println("Player already exist");
                    return false;
                }
                board[4][4]= symbol;
                break;
        }
        return true;

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

    static String doToss(){
        if (Math.random() < 0.5)
        {
            return "Head";
        }
        else {
            return "Tail";
        }
    }
    static boolean doesPlayerWins(char currentPlayer,char[][] board){
        return false;
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
        char currentPlayer;
        printBoard(board);

        String Toss = doToss();
        if (Toss.equals("Head") ){
            currentPlayer=playerLetter;
        }
        else {
            currentPlayer=computerLetter;
        }

        while (true)
        {
            int position=getPositionFromUser();

            boolean isPlayerPut=putPlayerOnBoard(board,position,currentPlayer);
            if (isPlayerPut){
                printBoard(board);
                if(doesPlayerWins(currentPlayer,board))
                {
                    System.out.println(currentPlayer+" wins");
                    break;
                }

                if(currentPlayer==playerLetter){
                    currentPlayer=computerLetter;
                }
                else if(currentPlayer==computerLetter){
                    currentPlayer=playerLetter;
                }
            }

        }

    }


}

