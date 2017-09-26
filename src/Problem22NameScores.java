import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Using names.txt (right click and 'Save Link/Target As...'),
 * a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the
 * list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
 * is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 *
 * Answer: 871198282
 *
 * Created by angelica on 22/09/17.
 */
public class Problem22NameScores {

    Letters letter;

    public ArrayList<String> readNames(String filename) throws IOException {

        File inFile = new File(filename);
        Scanner in = new Scanner(inFile).useDelimiter(",");

        ArrayList<String> array = new ArrayList<>();

        while (in.hasNext()) {
            String name = in.next().replace("\"", "").trim();
            array.add(name);
        }
        Collections.sort(array);
        return array;
    }

    public int calcNameScore(String n){
        int score = 0 ;
        char[] name = n.toUpperCase().toCharArray();
        for (char c : name){
            letter = Letters.valueOf(Character.toString(c));
            score += letter.getScore();
        }
        return score;

    }

    public BigInteger getNameScores(ArrayList<String> array){

        BigInteger totalScore = new BigInteger("0");
        for (int i = 0; i < array.size(); i++){
            long score = calcNameScore(array.get(i)) * (i+1);
            BigInteger b = new BigInteger(Long.toString(score));
            totalScore = totalScore.add(b);
        }
        return totalScore;
    }

    public static void main(String[] args) throws IOException {
        Problem22NameScores prob22 = new Problem22NameScores();
        ArrayList<String> a = prob22.readNames("src/p022_names.txt");
        //System.out.print(a.toString());
        System.out.print(prob22.getNameScores(a));
    }

}
