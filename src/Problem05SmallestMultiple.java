/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * This solution finds the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.
 * Answer: 232792560
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem05SmallestMultiple {

    public int divide(int n) {
        boolean found = false;
        int num = n;
        int remainder = 0;
        while(!found) {
            num += 20;
            for(int i = 2; i <= 20; i++){
                remainder += num % i;
            }
            if(remainder == 0){
                found = true;
            }
            remainder = 0;//assign back to zero
        }
        return num;
    }

    public static void main(String[] args) {
        Problem05SmallestMultiple prob5 = new Problem05SmallestMultiple();
        System.out.println(prob5.divide(2520));
    }
}
