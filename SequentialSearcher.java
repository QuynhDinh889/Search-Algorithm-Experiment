package Ass3;

/**
 * @Name: Anh Q.Dinh
 * @StudentNumber: 3194617
 * @Date: 5 April 2025
 */
public class SequentialSearcher extends Searcher {
    public int search(int[] a, int x){
        int iteration =0;
        for(int i=0; i<a.length; i++){
            iteration++;
            if(a[i] == x){break;}
        }
        return iteration;
    }

    public SequentialSearcher(){super("SequentialSearcher");}

    public String toString(){
        return className + ": \nMin = " + min + "\nMax = " + max + "\nAverage interations = " + avarage;
    }
}
