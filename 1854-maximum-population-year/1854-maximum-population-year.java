class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] delta = new int[2051];

        for (int[] log : logs) {
            delta[log[0]]++;
            delta[log[1]]--;
        }

        int currpop = 0;
        int maxpop = 0;
        int year = 1950;

        for (int y = 1950; y < 2050; y++) {
            currpop += delta[y];

            if (currpop > maxpop) {
                maxpop = currpop;
                year = y;
            }
        }

        return year;
    }
}