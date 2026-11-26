class Solution {
    public int maxFreqSum(String s) {
         List<Character> list=new ArrayList<>();
        int vm=0;
        int cm=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(!list.contains(ch)){
              list.add(ch);
              int c=0;
              for(int j=i;j<s.length();j++){
                if(ch==s.charAt(j)){
                    c++;
                }
              }
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 if(vm<c){
                    vm=c;
                 }
              }
              else{
                if(cm<c){
                    cm=c;
                }
              }
           }
        }
        return vm+cm;
    }
    }
}