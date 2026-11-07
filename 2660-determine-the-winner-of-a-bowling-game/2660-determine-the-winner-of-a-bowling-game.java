class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1=player1[0];
        int p2=player2[0];

        for(int i=1;i<player1.length;i++){
            if(player1[i-1]==10 ||(i>1) &&(player1[i-2]==10)){
                p1+=2*player1[i];
                continue;
            }
            p1+=player1[i];
        }
        for(int i=1;i<player2.length;i++){
            if(player2[i-1]==10 ||(i>1) &&(player2[i-2]==10)){
                p2+=2*player2[i];
                continue;
            }
            p2+=player2[i];
        }
        if(p1==p2){
            return 0;
        }

        return (p1>p2)? 1:2;
    }
}