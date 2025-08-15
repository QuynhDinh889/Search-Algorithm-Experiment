package Ass3;
/**
 * @Name: Anh Q.Dinh
 * @StudentNumber: 3194617
 * @Date: 5 April 2025
 */
import java.util.Random;

public class RandomSearcher extends Searcher{
    public int search(int[] a, int x){
        Random rand = new Random();
        int iteration =0;

        boolean found = false;
        while(!found){
            iteration++;
            int index = rand.nextInt(a.length);
            if(a[index] == x){found = true;}
        }
        return iteration;
    }

    public RandomSearcher(){super("RandomSearcher");}

    public String toString(){
        return className + ": \nMin = " + min + "\nMax = " + max + "\nAverage interations = " + avarage;
    }
    
}
