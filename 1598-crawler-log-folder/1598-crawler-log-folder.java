class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")){
                continue;
            }
            if(!st.isEmpty() && logs[i].equals("../")){
                st.pop();
                continue;
            }
            if(st.isEmpty() && logs[i].equals("../")){
                continue;
            }
             st.push(logs[i]);
        }
        return st.size();
    }
}