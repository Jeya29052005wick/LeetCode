class Solution {
    public char findTheDifference(String s, String t) {
        
        //Create HashMap
        HashMap<Character,Integer> map = new HashMap<>();

        //count frequency for s
        for(int i = 0 ; i< s.length();i++){

            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //count frequency for t
        for(int i = 0; i < t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        //Find the Character that contains frequency eqaul to -1
        for(int i = 0; i < t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)==-1){
                return ch;
            }
        }
        return ' ';
    }
}