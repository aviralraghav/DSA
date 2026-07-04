class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,d,m=x;
        while(m>0){
             d=m%10;
            sum = sum*10+d;
            m=m/10;
        }
        if(sum==x) return true;
        return false;
    }
}