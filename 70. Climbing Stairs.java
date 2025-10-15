class Solution {
    public int climbStairs(int n) {
        
        if(n<=2){
            return n;
        }

        int first = 1; int second = 2; int total = 0;

        for(int i = 3; i <= n ; i++){
            total = first + second;
            first = second;
            second = total;
        }
        return total;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Solution sol = new Solution();

        int n = scan.nextInt();
        System.out.println(sol.climbStairs(n));
    }
}