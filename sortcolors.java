class Solution {
    public void sortColors(int[] nums) {
            int cntzero=0,cntone=0,cnttwo=0;
        for(int i : nums){
         if(i==0) cntzero++;
         else if(i==1) cntone++;
         else cnttwo++;   
        }
        for(int i=0;i<cntzero;i++){
            nums[i]=0;
        }
        for(int i=0;i<cntone;i++){
            nums[cntzero+i]=1;
        }
        for(int i=0;i<cnttwo;i++){
            nums[cntzero+cntone+i]=2;
        }
    }
}