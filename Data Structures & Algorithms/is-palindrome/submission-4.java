class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            String s1 = ""+s.charAt(i);
            String s2 = ""+s.charAt(j);
            if(Character.isLetterOrDigit(s.charAt(i)) && 
            Character.isLetterOrDigit(s.charAt(j)) && 
            !s1.equalsIgnoreCase(s2)){
                return false;
            }
            else if(!Character.isLetterOrDigit(s.charAt(i)))
            i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            j--;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
