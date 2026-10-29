class Solution {
    public String replaceDigits(String s) {
      int asci=97;
      StringBuilder sb=new StringBuilder(s);
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(i>0 && Character.isDigit(ch)){
            sb.setCharAt(i,(char)(asci+(s.charAt(i-1)-'a')+(s.charAt(i)-'0')));
        }
      }
      return sb.toString();
    }
}