class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for(String word : arr){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(String word : arr){
            if(map.get(word) == 1){
                list.add(word);
            }
        }
        if(list.size()>=k){
            return list.get(k-1);
        }

        return "";
    }
}