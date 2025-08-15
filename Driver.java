package Ass3;
/**
 * @Name: Anh Q.Dinh
 * @StudentNumber: 3194617
 * @Date: 5 April 2025
 */
import java.util.Arrays;
public class Driver {
    public static void main(String[] args) {
        Searcher[] searchers = {new SequentialSearcher(), new BinarySearcher(), new RandomSearcher()};

        for (Searcher s: searchers){s.Experiment();}

        Arrays.sort(searchers);

        for (Searcher s: searchers){
            System.out.println(s);
        }
    }
}
