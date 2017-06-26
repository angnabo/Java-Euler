/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * Answer: 837799
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem14LongestCollatzSequence {

    /**
     * Returns the starting number with the longest collatz sequence below a given number.
     * @param start integer starting number.
     * @return starting number with the longest collaz sequence.
     */
    public  long collatz(int start) {
        long longestChain = 0;
        long starting = 0;
        for (int i = start; i > 1; i--) {//counts down from the start number parameter
            long chain = 0;
            long num = i;
            while (num > 1) {//collatz sequence stops at 1
                if (num % 2 == 0) {
                    num = num/2;
                } else {
                    num = 3*num+1;
                }
                chain++;
            }
            if (chain > longestChain) {
                longestChain = chain;
                starting = i;
            }
        }
        return starting;
    }

    public static void main(String[] args) {
        Problem14LongestCollatzSequence prob14 = new Problem14LongestCollatzSequence();
        System.out.println("longest: "+ prob14.collatz(1000000));
    }
}
