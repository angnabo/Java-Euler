/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * Answer: 31875000
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem09PythagoreanTriplet {

    public int pythagorianTriplet(int sum) {
        int triplet = 0;
        for (int a = 1; a <= sum/3; a++) { //the a in a pythagorean triplet is always <= 1/3 of the sum
            for (int b = 1; b <= sum/2; b++) { //the b in a pythagorean triplet is always <= 1/2 of the sum
                int c = sum - a - b; //it follows that c would be the difference of sum - a - b
                if ((a * a + b * b) == c * c) {
                    triplet = a * b * c;
                }
            }
        }
        return triplet;
    }

    public static void main(String[] args) {
        Problem09PythagoreanTriplet prob9 = new Problem09PythagoreanTriplet();
        System.out.println(prob9.pythagorianTriplet(1000));
    }
}
