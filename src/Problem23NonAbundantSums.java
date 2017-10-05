import java.util.ArrayList;
import java.util.Arrays;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 * which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant
 * if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 *
 * By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of
 * two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known
 * that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 *
 * Answer: 4179871
 *
 * Created by angelica on 26/09/17.
 */
//Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
public class Problem23NonAbundantSums {

    //Get all abundant numbers below a given number
    public ArrayList<Integer> getAbundantNumbers(int num){
        ArrayList<Integer> abundantNums = new ArrayList<>();
        for(int i = 2; i < num; i++){
            ArrayList<Integer> n = MathFunctions.getFactors(i);
            n.remove(n.size()-1);//remove the last number(the number itself)
            if(addArray(n) > i){
                abundantNums.add(i);
            }
        }
        return abundantNums;
    }

    public int addArray(ArrayList<Integer> array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }


    public int getNonAbundantSums(int num){
        ArrayList<Integer> abundantNums = getAbundantNumbers(num);
        boolean[] sumsOfAbundantNums = new boolean[num+1];
        for (int i = 0; i < abundantNums.size()-1; i++) {
            for (int j = 0; j < abundantNums.size()-1; j++) {
                if (abundantNums.get(i) + abundantNums.get(j) <= num) {
                    sumsOfAbundantNums[abundantNums.get(i) + abundantNums.get(j)] = true;
                } else {
                    break;
                }
            }
        }
        int ttl = 0;
        for (int i = 1; i <= num; i++) {
            if (!sumsOfAbundantNums[i]) {
                ttl += i;
            }
        }
        return ttl;

        //The below was my non-optimized, very time consuming implementation

//        ArrayList<Integer> nonSums = new ArrayList<>();
//        int i = 1;
//        while(i <= num) {
//            boolean isSum = true;
//            for (int j = 0; j < abundantNums.size(); j ++){
//                if (j > i){//no need to look through numbers bigger than i
//                    break;
//                }
//                if (abundantNums.contains(i-abundantNums.get(j))){//look for a sum pair
//                    isSum = true;
//                    break; //break out if at least one sum pair found
//                } else {
//                    isSum = false;
//                }
//            }
//            if (!isSum) {
//                nonSums.add(i);
//            }
//            i++;
//        }
//        return nonSums;
    }

    public static void main(String[] args) {
        Problem23NonAbundantSums prob23 = new Problem23NonAbundantSums();
        //ArrayList<Integer> a = prob23.getNonAbundantSums(28123);
        System.out.print(prob23.getNonAbundantSums(28123));
    }
}
