class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        System.out.println(s);
        while(l<r){
           if(Character.isLetterOrDigit(s.charAt(l)) &&
           Character.isLetterOrDigit(s.charAt(r)) &&
           s.charAt(l)!=s.charAt(r))
           return false;
           else if(!Character.isLetterOrDigit(s.charAt(l)))
           l++;
           else if(!Character.isLetterOrDigit(s.charAt(r)))
           r--;
           else{
            l++;
            r--;
           }
        }
         return true;
    }
}
