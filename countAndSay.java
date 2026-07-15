class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        String ans="";
        int j=0,i=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
          int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                return ans;
    }
}