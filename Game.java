/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;



/**
 *
 * @author Sabir Rohan Quazi
 */
public class Game {
    
    
   protected char currentPlayermark;
   private final char[][] board;
   private char [][] checkRowCol;
   
   
   
   
   public char getCurrentPlayermark() {
       
   return currentPlayermark;
   
   }
   
   public Game (){
        board = new char[3][3];
        currentPlayermark = 'x';
        initializeBoard();
        
    }

    void initializeBoard() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
  public void printBoard(){
      System.out.println("------------");
      
      for(int i = 0; i < 3; i++) {
          System.out.print("| ");
          for (int j = 0; j < 3; j++) {
              System.out.print(board[i][j] + "| ");
          }     
      
          System.out.println();
          System.out.println("-------------");
          
          
      }
  }

    /**
     *
     * @return
     */
     
    public boolean isBoardFull(){
        boolean isFull;  
        isFull = true;
       
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == '-'){ 
                    isFull = false;
                }
            }
        }      
          
        return isFull;
    }
    
    
    
    public boolean TittaförVinst(){
        return (TittaRowförVinst() || TittaColumnsFörVinst() || TittaDiagonalFörVinst());
    }
      
    private boolean TittaRowförVinst(){
        for (int i = 0; i < 3; i++){
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true){
                return true;
            }
            
            
        }
        return false;
        
    }
    
    
    private boolean TittaColumnsFörVinst() {

        for (int i = 0; i < 3; i++) {

            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {

                return true;

            }

        }

        return false;

    
    }
     
    
    private boolean TittaDiagonalFörVinst(){
        
        return(checkRowCol (board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
        
    }

    
    private boolean checkRowCol(char c1, char c2, char c3) {

        return ((c1 != '-') && (c1 == c2) && (c2 == c3));

    }

    public void changePlayer(){
        if (currentPlayermark == 'x'){
            currentPlayermark = 'o';
        }
        else {
            currentPlayermark = 'x';
        }
    }
    
    public boolean PlaceMarker(int row, int col){
        
        
        if ((row >= 0) && (row < 3)) {
            
            if ((col >= 0) && (col < 3)){
                
                if (board[row][col] == '-'){
                    board[row][col] = currentPlayermark;
                    return true;
                }
                
            }
            
        }
        
    return false;
    
    }
    
}        

    




  
    
    

