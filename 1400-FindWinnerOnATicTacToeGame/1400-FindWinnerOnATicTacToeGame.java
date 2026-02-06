// Last updated: 2/6/2026, 2:23:32 PM
class Solution {
    public String tictactoe(int[][] moves) {

        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            int[] player;
            if (i % 2 == 0) {
                player = a;
            } else {
                player = b;
            }

            player[row] += 1;
            player[col + 3] += 1;

            if (row == col) {
                player[6] += 1;
            }

            if (row == 2-col) {
                player[7] += 1;
            }
        }

        for (int i = 0; i < 8; i++) {
            if (a[i] == 3) return "A";
            if (b[i] == 3) return "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}