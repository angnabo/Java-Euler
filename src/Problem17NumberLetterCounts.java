import java.util.Arrays;

/**
 * Description
 * Answer: 906606
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem17NumberLetterCounts {

    public long countAllNumbers() {
        long count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += letterCounts(numberInWords(i+""));
        }
        return count;
    }

    public long letterCounts(String[] word) {
        long count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(" ") || word[i].equals("-")){
            } else {
                count++;
            }
        }
        return count;
    }

    public String[] numberInWords(String num) {
        String[] n = num.split("");
        String numberInWords = "";

        if (n.length == 1) {
            numberInWords = oneDigit(n[0]);
        }

        if (n.length == 2) {
            if (n[0].equals("1")) {
                numberInWords = tenToTwenty(n[1]);
            } else {
                numberInWords = tens(n[0]) + oneDigit(n[1]);
            }
        }

        if (n.length == 3) {
            if (n[1].equals("0") && n[2].equals("0")) {
                numberInWords = hundreds(n[0]);
            } else if (n[1].equals("0")) {
                numberInWords = hundreds(n[0]) + " and " + oneDigit(n[2]);
            } else if (n[1].equals("1")) {
                numberInWords = hundreds(n[0]) + " and " + tenToTwenty(n[2]);
            } else {
                numberInWords = hundreds(n[0]) + " and " + tens(n[1]) + oneDigit(n[2]);
            }
        }

        if (n.length == 4) {
            numberInWords = "one thousand";
        }

        String[] word = numberInWords.split("");
        return word;

    }

    public String oneDigit(String num) {
        String digit;
        switch (num) {
            case "0":
                digit = " ";
                break;
            case "1":
                digit = "one";
                break;
            case "2":
                digit = "two";
                break;
            case "3":
                digit = "three";
                break;
            case "4":
                digit = "four";
                break;
            case "5":
                digit = "five";
                break;
            case "6":
                digit = "six";
                break;
            case "7":
                digit = "seven";
                break;
            case "8":
                digit = "eight";
                break;
            case "9":
                digit = "nine";
                break;
            default:
                digit = "Invalid";
                break;
        }
        return digit;
    }

    public String tenToTwenty(String num) {
        String digit;
        switch (num) {
            case "0":
                digit = "ten";
                break;
            case "1":
                digit = "eleven";
                break;
            case "2":
                digit = "twelve";
                break;
            case "3":
                digit = "thirteen";
                break;
            case "4":
                digit = "fourteen";
                break;
            case "5":
                digit = "fifteen";
                break;
            case "6":
                digit = "sixteen";
                break;
            case "7":
                digit = "seventeen";
                break;
            case "8":
                digit = "eighteen";
                break;
            case "9":
                digit = "nineteen";
                break;
            default:
                digit = "Invalid";
                break;
        }
        return digit;
    }

    public String tens(String num) {
        String digit;
        switch (num) {
            case "2":
                digit = "twenty-";
                break;
            case "3":
                digit = "thirty-";
                break;
            case "4":
                digit = "forty-";
                break;
            case "5":
                digit = "fifty-";
                break;
            case "6":
                digit = "sixty-";
                break;
            case "7":
                digit = "seventy-";
                break;
            case "8":
                digit = "eighty-";
                break;
            case "9":
                digit = "ninety-";
                break;
            default:
                digit = "Invalid";
                break;
        }
        return digit;
    }

    public String hundreds(String num) {
        return oneDigit(num) + " hundred";
    }



    public static void main(String[] args) {
        Problem17NumberLetterCounts prob4 = new Problem17NumberLetterCounts();
        System.out.println(prob4.countAllNumbers());
    }
}
