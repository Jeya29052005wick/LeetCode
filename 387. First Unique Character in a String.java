class Solution {
    public int firstUniqChar(String s) {

        // create hashmap
        HashMap<Character,Integer> map = new HashMap<>();

        //count frequency
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //Find The First Non repeating character
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);

            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}