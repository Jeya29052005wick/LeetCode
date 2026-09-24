class Solution {
    public String[] findWords(String[] words) {
        

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(String word : words){

            String lower = word.toLowerCase();

            boolean inRow1 = true;
            boolean inRow2 = true;
            boolean inRow3 = true;

            for(char ch : lower.toCharArray()){

                if(row1.indexOf(ch)==-1){
                    inRow1 = false;
                }

                if(row2.indexOf(ch)==-1){
                    inRow2 = false;
                }

                if(row3.indexOf(ch)==-1){
                    inRow3 = false;
                }
            }
            if(inRow1 || inRow2 || inRow3){
                result.add(word);
            }
        }
       return result.toArray(new String[0]);
    }
}