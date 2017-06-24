/**
 * A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Answer: 906606
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */

public class Problem04LargestPalindromeProduct {

    /**
     * Returns true if a number is a palindrome
     * @param num integer or string
     * @return true if number is a palindrome
     */
    public <T> boolean isPalindrome(T num) {
        String string = num + "";
        String reverseString = new StringBuilder(string).reverse().toString();
        return (string.equals(reverseString));
    }

    /**
     * Returns largest palindrome product of any two numbers below a given number
     * @param num integer
     * @return largest palindrome product
     */
    public int palindrome(int num){
        int palindrome = 0;
        for(int x = num; x > 100; x--) { //each number get multiplied by every number
            for(int y = num; y > 100; y--) {
                int product = x*y;
                if((isPalindrome(product)) && (product > palindrome)) {
                    palindrome = product;
                }
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Problem04LargestPalindromeProduct prob4 = new Problem04LargestPalindromeProduct();
        System.out.println(prob4.palindrome(999));
    }

}
