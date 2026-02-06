// Last updated: 2/6/2026, 2:23:43 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int m = 0;
        int n = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    m = i;
                    n = j;
                    break;
                }
            }
        }

        int count = 0;

            for(int j=m; j<8; j++){         
                 if(board[j][n] == 'B'){ 
                     break;
                 }
                else if(board[j][n] == 'p') {
                    count++;
                    break;
                }
            }
            for(int j=m; j>=0; j--){   
                 if(board[j][n] == 'B') {
                     break;
                 }
                else if(board[j][n] == 'p') {
                    count++;
                    break;
                }
            }
            for(int j=n;j<8;j++){  
                if(board[m][j] == 'B') {
                    break;
                }
                else if(board[m][j] == 'p') {
                    count++;
                    break;
                }
            }
            for(int j=n; j>=0; j--){    
                 if(board[m][j] == 'B'){ 
                    break;
                    }
                else if(board[m][j] == 'p') {
                    count++;
                    break;
                }
            }
            
            return count;
    }
}