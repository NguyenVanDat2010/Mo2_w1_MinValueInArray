import java.util.Scanner;
public class MinValueInArray {
        public static int minValue(int[] arrA){
        int min=arrA[0];
        for (int i=1;i<arrA.length;i++){
            if (arrA[i]<min){
                min=arrA[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9,-4};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
}
