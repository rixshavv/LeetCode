class Solution {
    public boolean canAliceWin(int n) {
     int move = 10;

        while (n >= move) {
            n -= move;
            move--;
        }

        return move % 2 == 1;
    }
}