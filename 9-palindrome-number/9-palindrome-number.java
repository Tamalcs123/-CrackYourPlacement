class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int r=x;
        while(x>0){
            res=res*10+x%10;
            x=x/10;
        }
        if(res==r){
            return true;
        }
        return false;
        
    }
}