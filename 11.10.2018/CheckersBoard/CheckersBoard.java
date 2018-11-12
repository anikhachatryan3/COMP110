//Name: Ani Khachatryan
//Date: 11/10/2018
//App: CheckersBoard
//Purpose:

class CheckersBoard {

      public static void main(String[] args) {
      
      final int blank = 0;  //blank space
      final int white = 1;  //white piece
      final int blue = 2;   //blue piece
      
      int[][] board = new int[8][8];
      for(int row = 0; row < board.length; row++) {
         
         for(int col = 0; col < board.length; col++) {
            
            if((row + col) % 2 == 0 && row < 3){
               board[row][col] = white;
            }
            
            else if(row == 3 && row == 4) {
               board[row][col] = blank;
            }
            
            else if((row + col) % 2 == 1 && row < 2 && row > 4) {
               board[row][col] = blank;
            }
            
            else if((row + col) % 2 == 0 && row > 4) {
               board[row][col] = blue;
            }
            
            
         }
         
         
      }
         
      for(int row = 0; row < board.length; row++) {
            
         for(int col = 0; col < board.length; col++) {
               
            System.out.print(board[row][col] + " ");
         }
         System.out.println();
            
      }

   }
      
}
