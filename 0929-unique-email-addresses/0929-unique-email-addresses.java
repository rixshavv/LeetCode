class Solution {
    public int numUniqueEmails(String[] emails) {
        StringBuilder sb=new StringBuilder();
        HashSet<String> s=new HashSet<>();

        for(String word:emails){
            int i=0;

            while(i<word.length()){
                if(word.charAt(i)=='.'){
                    i++;
                    continue;
                }
                if(word.charAt(i)=='+'){
                    while(word.charAt(i)!='@'){
                        i++;
                    }
                    sb.append(word.substring(i));
                    break;
                }
                if(word.charAt(i)=='@'){
                    sb.append(word.substring(i));
                    break;
                }
                sb.append(word.charAt(i));
                i++;
            }
            s.add(sb.toString());
            sb.setLength(0);

        }

        return s.size();
    }
}