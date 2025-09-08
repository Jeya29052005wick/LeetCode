class Solution {
  public static boolean isPalindrome(int x)
  {
    if(x<0)
    {
        return false;
    }
    String str = String.valueOf(x);
    int left = 0;
    int right = str.length() - 1;

    while(left<right)
    {
        if(str.charAt(left) != str.charAt(right))
        {
            return false;
        }
        left ++;
        right --;
    }
    return true;
   }

   public static void main(String args[])
   {
    ystem.out.println(isPalindrome(121));
   }
}