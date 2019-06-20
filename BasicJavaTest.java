import java.util.Arrays;
import java.util.ArrayList;
public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava iD = new BasicJava();
        iD.Get1to255(1, 255);
        iD.Get1to255Odd(1, 255);
        iD.PrintSum(0, 255);
        int[] array = {1,3,5,7,9,13};
        iD.IteratingArray(array);
        int[] array2 = {12,23,35,7,9,13};
        iD.FindMax(array2);
        double[] array3 = {1.4, 7, 3};
        iD.FindAvg(array3);
        System.out.println(iD.ArraywithOdd(1, 255));
        int[] arr = {1, 5, 10, -2};
        System.out.println(Arrays.toString(iD.squareValues(arr)));
        int[] arr2 = {1, 5, 10, -2};
        System.out.println(Arrays.toString(iD.eliminateNegatives(arr2)));
        int[] arr3 = {1, 5, 10, -2};
        System.out.println(Arrays.toString(iD.MaxMinAvg(arr3)));
        int[] arr4 = {1, 5, 10, 7, -2};
        System.out.println(Arrays.toString(iD.shiftValues(arr4)));
        }
    }