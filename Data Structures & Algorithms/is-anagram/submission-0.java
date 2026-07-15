class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        char temp[]=new char[26];
        for(int i=0;i<s1.length;i++){
            temp[s1[i]-'a']++;
        }
        for(int i=0;i<s2.length;i++){
            temp[s2[i]-'a']--;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0)
            return false;
        }
    return true;
    }
}
