class Solution {
    public int fib(int number) {

        int first = 0;
        int second = 1;

        if (number == 0){
            return 0;
        } 

        for (int i = 1; i <= number; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return first;
    }
}
