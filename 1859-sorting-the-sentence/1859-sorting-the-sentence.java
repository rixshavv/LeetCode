class Solution {
    class pair{
        String str;
        int number;

        pair(String str,int number){
            this.str=str;
            this.number=number;
        }
    }
    public String sortSentence(String s) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.number,b.number));

        String [] words=s.split(" ");

        for(int i=0;i<words.length;i++){
            String word=words[i];
            int j=0;
            while(j<word.length()){
                if(Character.isDigit(word.charAt(j))){
                    pq.offer(new pair(word.substring(0,j),word.charAt(j)-'0'));
                }
                j++;
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            pair p=pq.poll();
            sb.append(p.str);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}