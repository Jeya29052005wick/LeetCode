class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String [] arr1 = s1.split(" ");
        String [] arr2 = s2.split(" ");

        ArrayList<String> list = new ArrayList<>();

        for(String word : arr1){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(String word : arr2){
            map.put(word,map.getOrDefault(word,0)+1);
        }

          for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}