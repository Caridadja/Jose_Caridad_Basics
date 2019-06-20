import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava {
    public void Get1to255(int start, int end){
        while (start <= end){
            System.out.println(start);
            start++;
        }
    }

    public void Get1to255Odd(int start, int end) {
        while (start <= end) {
            if (start % 2 != 0) {
                System.out.println(start);
            }
            start++;
        }
}


    public void PrintSum(int start, int end) {
        int sum = 0;
        while (start <= end) {
            sum += start;
            System.out.println("New number: "+start+ " Sum: "+sum);
            start++;
        }
    }


    public void IteratingArray(int[] x) {
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]);
        }
    }




        public void FindMax(int[] x) {
            int max = x[0];
            for(int i = 0; i < x.length; i++){
                if(x[i] > max){
                    max = x[i];
                }
            }
            System.out.print(max);
        }


    public void FindAvg(double[] x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        double avg = sum / x.length;
        System.out.print(avg+"\n");
    }


    public ArrayList<Integer> ArraywithOdd(int start, int end) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                y.add(i);
            }
        }
        return y;
        }


    public Integer greaterThanY(int[] x, int y) {
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > y){
                sum++;
            }
        }
        return sum;
        }


    public int[] squareValues(int[] x) {
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * x[i];
        }
        return x;
        }

    public int[] eliminateNegatives(int[] x) {
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        return x;
        }


    public double[] MaxMinAvg(int[] x) {
        double max= x[0];
        double min = x[0];
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
            if(x[i] < min){
                min = x[i];
            }
            sum += x[i];
        }
        double avg = sum / x.length;
        double[] newarr = {max, min, avg};
        return newarr;
        }


    public int[] shiftValues(int[] x) {
        for(int i = 0; i < x.length-1; i++){
            x[i] = x[i+1];
        }
        x[x.length-1] = 0;
        return x;
        }
    }