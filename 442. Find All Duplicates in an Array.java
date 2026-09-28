class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int c : nums){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int c : map.keySet()){
            if(map.get(c) > 1){
                list.add(c);
            }
        }
        return list;
    }
}