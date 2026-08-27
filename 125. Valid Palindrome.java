class Solution {
    public boolean isPalindrome(String s) {
       String result = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result = result + c;
            }
        }
        String l = result.toLowerCase();
        
        String rev = "";
        for(int i = l.length()-1; i >= 0; i--){
            rev = rev + l.charAt(i);
        }
        

        if(l.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}