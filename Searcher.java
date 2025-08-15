package Ass3;
/**
 * @Name: Anh Q.Dinh
 * @StudentNumber: 3194617
 * @Date: 5 April 2025
 */
import java.util.Random;

public abstract class Searcher implements Comparable<Searcher>, Experimentable{
    protected int min = Integer.MIN_VALUE;
    protected int max = Integer.MAX_VALUE;
    protected double avarage = Double.MAX_VALUE;
    protected String className;

    public Searcher(String className){this.className = className;}

    public abstract int search(int[] a, int x);

    public void Experiment(){
        int[] a = new int[100];
        for(int i=0; i<100; i++){
            a[i] = i+1;
        }

        Random rand = new Random();
        int total=0;
        for (int i=0; i<1000; i++){
            int x = rand.nextInt(100) +1;
            int iteration = search(a,x);
            total += iteration;

            if (iteration < min){min = iteration;}
            if (iteration > max){max = iteration;}
        }
        avarage = total/1000.0;

    }
    
    public double getAvarage(){return avarage;}

    public int compareTo(Searcher s){
        return Double.compare(this.avarage, s.avarage);
    }

    public String toString(){
        return className + ": \nMin = " + min + "\nMax = " + max + "\nAverage interations = " + avarage;
    }
}
