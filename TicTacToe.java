/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Sabir Rohan Quazi
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        boolean gamerun = true;
    
        
        Scanner scan = new Scanner(System.in);
        Game newGame = new Game();
        while (gamerun)
        {  
        newGame.initializeBoard();
       
        System.out.println("Tic-Tac-Toe!");
        do 
        {            
         
            System.out.println("Current Board layout:");
            newGame.printBoard();
            int row;
            int col;
            do 
            {
                System.out.println("Player " + newGame.getCurrentPlayermark() + ", enter an empty row and column to place your mark");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
                
                
                
                
                          
               } while(!newGame.PlaceMarker(row, col));
                 newGame.changePlayer();
                 
                 
        }         
        while(!newGame.TittaförVinst() && !newGame.isBoardFull());
        
        if (newGame.isBoardFull() && !newGame.TittaförVinst())
        {
            System.out.println("The game was a tie");
            
            
        }
        else {
            
            System.out.println("Current board layout:");
            newGame.printBoard();
            newGame.changePlayer();
            System.out.println(Character.toUpperCase(newGame.getCurrentPlayermark()) + "wins!");
            
        
        }
        
        
        newGame.isBoardFull();
        
        
        
        
      }
        
  
    
}


}   

