package Ass3;
/**
 * @Name: Anh Q.Dinh
 * @StudentNumber: 3194617
 * @Date: 5 April 2025
 */
public class BinarySearcher extends Searcher {
    public int search(int[] a, int x){
        int left =0;
        int right = a.length-1;
        int iteration=0;

        while (left <= right){
            iteration++;
            int avg = (left+right)/2;
            
            if(a[avg] == x) {break;}
            else if(a[avg] < x){left = avg+1;}
            else {right = avg-1;}
        }
        return iteration;
    }
    
    public BinarySearcher(){super("BinarySearcher");}

    public String toString(){
        return className + ": \nMin = " + min + "\nMax = " + max + "\nAverage interations = " + avarage;
    }
}
