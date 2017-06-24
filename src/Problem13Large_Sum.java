import java.math.BigInteger;

/**
 * Answer:
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */

public class Problem13Large_Sum {

    public BigInteger roundBigInt(String bigInt) {
        BigInteger num = new BigInteger("bigInt");
        return (num.divide(new BigInteger("10000000000000000000000000000000000000000")).multiply(new BigInteger("10000000000000000000000000000000000000000")));
    }






    public static void main(String[] args) {
        Problem13Large_Sum prob4 = new Problem13Large_Sum();
        System.out.println();

    }
}
