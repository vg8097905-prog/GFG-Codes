class Solution {
    boolean isPalindrome(String s) {
        // code here
       int Right=s.length()-1;
            for(int Left =0;Left<s.length();Left++){
                if(Left<=Right){
                    if(s.charAt(Left)!=s.charAt(Right)){
                    return false;
                    }
                }
                Right--;
            }
         return true;    
    }
}