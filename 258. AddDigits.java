class Solution {
    public int addDigits(int num) {
       while(num >= 10){
        int sum = 0;
        while(num>0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        num = sum;
       }
       return num;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Solution sol = new Solution();
        int num = scan.nextInt();
        sol.addDigits(num);
    }
}